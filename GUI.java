import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {




    int count = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;
    JButton button;
    JButton button2;
    JLabel lab2;
    Player p;
    
    public JLabel getlab1(){
      return label;
    
    }
    
    public JFrame getframe(){
      return frame;
    
    }
    
    public JPanel getPanel(){
      return panel;
    
    }
    
    public JButton getBut1(){
      return button;
    
    }
    
    public JButton getBut2(){
      return button2;
    }
    
    public JLabel getLab2(){
      return lab2;
    
    }
    
    public Player getPlayer(){
      return p;
    }

    public GUI(Player p) {
        this.p = p;
    
        frame = new JFrame();
        button = new JButton("Option 1");
        button2 = new JButton("Option 2");
        button.setBounds(10,20,120,200);
        button2.setBounds(20,30,150,300);
        lab2 = new JLabel();
        
        

        button.addActionListener(this);
        button2.addActionListener(this);

        label = new JLabel("Number of clicks: 0");
        panel = new JPanel();
        lab2.setPreferredSize(new Dimension(100,100));  
        lab2.setBounds(0,100,100,100);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(lab2,BorderLayout.CENTER);
        panel.add(label);
        panel.add(button);
        panel.add(button2);
        
        
        

        frame.add(panel, BorderLayout.SOUTH);
        
        Border border = new LineBorder(Color.ORANGE, 4, true);
       panel.setBorder(border);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setTitle("Choose Your Own Adventure!");
        frame.pack();
        frame.setVisible(true);
        
        

    }
    
    

    public static void main(String[] args) {
        Player bob = new Player();
        
        new GUI(bob);
    }
    
    public static void startGame(Player p){
      new GUI(p);
    
    }

    
    public void op1(){
      p.setOp(1);
      
      search();
    }
    
    public void op2(){
      p.setOp(2);
      
      search();
      
    
    }
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==button) {
            op1();
            
            
            
        }
        else{
            op2();
           
            
            
            
        }
        
        
        

    }
    
     
      public void search(){
         if(p.getCode1() == 1){
         
            Cave.findNextCave(this);
         }
         
      }
      
      public void convert(Branch b){
      
         p.setLoc(b.getName());
         p.setCode1(b.getCode1());
         p.setCode2(b.getCode2());
         frame.setTitle(p.getLoc());
         
         label.setText(b.getLabel());
         
         button.setLabel(b.getOp1());
         button2.setLabel(b.getOp2());
         
         PutImage.displayImage(frame,b.getImage(), lab2);

      }
   
   
   

    

}