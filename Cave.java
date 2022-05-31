import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Cave{


   public static void loopCave(GUI g){
      Player p = g.getPlayer();
      int code = p.getCode2();
      if (code==1){
         cave1(g);
      
      }
      else if (code==2){
         cave2(g);
      }
      else if (code==3){
      
         cave3(g);
      }
      else if (code==4){
         cave4(g);
      }
      else if(code==5){
         cave5(g);
      }
      else if (code==6){
         cave6(g);
      }
   
   }
  
      
  
   public static void findNextCave(GUI g){
      Player p = g.getPlayer();
      if((p.getCode2() == 100)){
         if(p.getOp() ==1){
            g.startView();
         
         }
         else {
            p.setCode1(p.getLCode1());
            p.setCode2(p.getLCode2());
            loopCave(g);
         
         }
         
         
      
      }
      
      
     
      else {
      
         g.getPlayer().setLCode1(g.getPlayer().getCode1());
         g.getPlayer().setLCode2(g.getPlayer().getCode2());
         if (p.getCode2()==0){
            if(p.getOp()==1){
               p.setCode2(1);
            
            }
            else{
               p.setCode2(2);
            }
         
         }
         else if(p.getCode2()==1){
            if(p.getOp()==1){
               p.setCode2(3);
            
            }
            else{
               p.setCode2(4);
            }
         
         }
         
         else if(p.getCode2() ==2){
            if(p.getOp()==1){
               p.setCode2(5);
            
            }
            else{
               p.setCode2(6);
            }
   
         
         }
         else if((p.getCode2() ==6)&& (p.getOp()==2)){
            win(g);
         
         }
         
         
         
        
         else{
            lost(g);
         
         }
         loopCave(g);
         
      
      
      }
      
   }
         
      
      
      
      
   
     
   
 
   public static void cave1(GUI g){
   
      Branch cave1 = new Branch(1, 1, "3", "4", "cave1.PNG", "Which way will you progress?");
      g.convert(cave1);  
   
   }
   
   public static void cave2(GUI g){
   
      Branch cave2 = new Branch(1, 2, "5", "6", "cave2.PNG", "Which way will you progress?");
      g.convert(cave2);  
   
   }
   
   public static void cave3(GUI g){
   
      Branch cave3 = new Branch(1, 3, "up", "down", "cave3.PNG", "can i fly?");
      g.convert(cave3);  
      
   
   }
   
   public static void cave4(GUI g){
   
      Branch cave4 = new Branch(1, 4, "left", "right", "cave4.PNG", "when is a sloth?");
      g.convert(cave4);  
   
   }
   
   public static void cave5(GUI g){
   
      Branch cave5 = new Branch(1, 5, "dog", "cat", "cave5.PNG", "dog or cat?");
      g.convert(cave5);  
   
   }
   
   public static void cave6(GUI g){
   
      Branch cave6 = new Branch(1, 6, "yes", "no", "cave6.PNG", "help?");
      g.convert(cave6);  
   
   }
   
   public static void lost(GUI g){
      Branch lost = new Branch(1,100,"restart section", "go to last option", "cod.PNG", "you lose.");
      g.convert(lost);
   
   }
   
   public static void win(GUI g){
      Branch win = new Branch(0,0,"YEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "SO PROUD", "morgannn.jpg", "WINNER");
      g.convert(win);
         
   }




}
