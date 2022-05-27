  
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Cave{


   public static void searchCave(GUI g){
      Branch[] caves = new Branch[6];
      Branch cave1 = new Branch(1, 1, "3", "4", "cave1.PNG", "Which way will you progress?");
      Branch cave2 = new Branch(1, 2, "5", "6", "cave2.PNG", "Which way will you progress?");
      Branch cave3 = new Branch(1, 3, "up", "down", "cave3.PNG", "can i fly?");
      Branch cave4 = new Branch(1, 4, "left", "right", "cave4.PNG", "when is a sloth?");
      Branch cave5 = new Branch(1, 5, "dog", "cat", "cave5.PNG", "dog or cat?");
      Branch cave6 = new Branch(1, 6, "yes", "no", "cave6.PNG", "help?");
      caves[0] = cave1;
      caves[1] = cave2;
      caves[2] = cave3;
      caves[3] = cave4;
      caves[4] = cave5;
      caves[5] = cave6;
      int count = g.getPlayer().getCode2();
      g.convert(caves[count-1]);      
      
      
      
   
   
   }
  
      
  
   public static void findNextCave(GUI g){
      Player p = g.getPlayer();
      if(p.getCode2()==0){
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
      
      searchCave(g);
      
      
   }
 
   
   
   public static void lost(GUI g){
      Branch lost = new Branch(0,0,"xxxxxxxxxxxxxxxxxxxxxxxxx", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "cod.PNG", "you lose.");
      g.convert(lost);
   
   }
   
   public static void win(GUI g){
      Branch win = new Branch(0,0,"YEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "SO PROUD", "morgannn.jpg", "WINNER");
      g.convert(win);
         
   }




}