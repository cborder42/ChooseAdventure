//this file contains the code for the buttons, JFrame, as well as basically the main game
// it uses the buttons to allow navigation between the branches
//fair warning rn the dimensions of the frames, labels, etc arent exactly top quality, but should work
// feel free to let us know if u have any suggestions for graphics and such, we can try to make that too



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



    //instance variables for GUI class
    int count = 0;
    
    //label contains the words for the next question/direction for each step
    JLabel label;
    
    //the frame contains the panel & labels, similar to a window
    //panel is used add the buttons and labels on to the frame
    JFrame frame;
    JPanel panel;
    
    //these are the two buttons, each of which have a label. button represents option1 and button2 represents option2
    JButton button;
    JButton button2;
    
    //lab2 will contain the imported image on it
    JLabel lab2;
    
    // the class also has a player which is the main player going through the game
    Player p;
    
    // there is also a Dimension object that stores the size of the user's screen
    
    Dimension size1;
    
    
    //accessor methods for GUI class
    
    public Dimension getDim(){
        return size1;
        
    }
        
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

    //this is the constructor for the GUI class, it takes a Player parameter which is the player in the main game
    public GUI(Player p) {
        this.p = p;
        
        //this sets the default start and frame w/ dimensions etc this part could still change, but isnt terrible rn
    
        //creating buttons using JButton
        frame = new JFrame();
        button = new JButton("Start Game");
        button2 = new JButton("Start Game but 2~~");
        
        lab2 = new JLabel();
        
        
        //size1 stores the dimensions of the user's screen
        size1 = Toolkit.getDefaultToolkit().getScreenSize();
        
        //setting the button sizes using size1
        button.setPreferredSize(new Dimension(size1.width,size1.height/7));
        button2.setPreferredSize(new Dimension(size1.width,size1.height/7));

        //.addActionListen will register when the button is clicked to perform an action
        button.addActionListener(this);
        button2.addActionListener(this);
        

        label = new JLabel("Welcome!");
        panel = new JPanel();
        
        
        label.setSize(size1.width,size1.height/7);
        
        
        panel.setPreferredSize(new Dimension(size1.width, size1.height)); //setting the panel to the size of the user's screen so that the frame is sized to be full screen
        lab2.setBounds(0,100,100,100);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new FlowLayout());
        
        //adding our objects onto the panel to be displayed
        panel.add(lab2);
        panel.add(label);
        
        panel.add(button);
        panel.add(button2);       

        frame.add(panel, BorderLayout.CENTER); 
        
        //creating a border for our window
        Border border = new LineBorder(Color.PINK, 4, true);
        panel.setBorder(border);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setTitle("Choose Your Own Adventure!");
        frame.pack();
        frame.setVisible(true);
    }

    
    
    // this method is used to start playing the game, simply call GUI.startGame(playerName) and it will start the window, etc
    
    public static void startGame(Player p){
      new GUI(p);
    
    }

    
    //this sets the players current option to 1
    public void op1(){
      p.setOp(1);
      
      search();
    }
    
    //this sets the players current option to 2 and calls the search method
    public void op2(){
      p.setOp(2);
      
      search();
      
    
    }
    
    //this part is for tracking the action/clicking of the buttons
    public void actionPerformed(ActionEvent e) {
        
        //if the top button is clicked, it calls op1 (explained above)
        if(e.getSource()==button) {
            op1();
                  
        }
        
        //if the lower button is clicked, it calls op2 (explained above)
        else{
            op2();

        }

    }
    
     //the search method will direct the player through the main branches of the story
    // for example a main branch might be the "cave" branch, within the cave branch there would be multiple branch objects of story branches within cave
      public void search(){
         if(p.getCode1() == 1){
         
            Cave.findNextCave(this);
         }
          
         if(p.getCode1() == 2){
             
             Water.findNextWater(this);
             
         }
         
      }
      
      // this method converts the parameters of the GUI class, updating the labels, image, title, etc
      // it takes a branch object which will contain all of this imformation
      public void convert(Branch b){
      
         p.setLoc(b.getName());
         p.setCode1(b.getCode1());
         p.setCode2(b.getCode2());
         frame.setTitle(p.getLoc());
         
         label.setText(b.getLabel());
         
         button.setLabel(b.getOp1());
         button2.setLabel(b.getOp2());
         
         PutImage.displayImage(frame,b.getImage(), lab2, size1);

      }
      

}
