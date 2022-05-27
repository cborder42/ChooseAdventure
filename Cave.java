//this is an example class of how the main branch might look
//it would be what the code1 variable in player directs to
// it contains multiple branch objects which are navigated through
//fair warning there are images being using in the class for the branches which u would need to have downloaded and saved in the same file as all ur other stuff
//since this is just an example branch, i figure it doesnt matter too much if u have the exact images, so you can just use whatever ya like
//but for the actual branches we will have to make sure to coordinate on this 


//the navigation system in this code works, but is not very 'sleek' to say the least, both the searchCave and findNextCave methods could probably be 
//shortened or done in a more efficient way so plz try to help condense that if i can idk I tried to I swear :')



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Cave{
   
  
   // the searchCave method contains the branches created within the main branch. it takes a GUI object as a parameter which is just the GUI object of the game being played

   public static void searchCave(GUI g){
     
      //it uses an array of branch objects
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
      
      // it takes the second code of the player which directs it to the subbranch within the cave class 
      //does this by directing the player to one part of the array of branches
      int count = g.getPlayer().getCode2();
     
      //it then calls the convert(Branch b) method from the GUI class to change all the variables and such (more info in GUI class)
      g.convert(caves[count-1]);      
      
      
      
   
   
   }
  
      
  
   //the findNextCave method is where the code is first directed in this class after a button is clicked
  
   public static void findNextCave(GUI g){
     
      //it takes the player, finding the code2 of the player and using that to find out where they go next
   
      Player p = g.getPlayer();
     
      //for example, here if the player code2 = 0 (the player is at subbranch 0 of the cave class)
     //the it will check if the player's current op (option chosen) is 1 or 2 (which was changed right before this in the GUI class)
     //it then changes the player's code 2 according to the current position of the player and which option was chosen
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
     
     //it then calls the searchCave method (above) to play, run, update next branch whatever stuff
      
      searchCave(g);
      
      
   }
 
   
   //these are methods that could be called for if the player lost or something
   public static void lost(GUI g){
      Branch lost = new Branch(0,0,"xxxxxxxxxxxxxxxxxxxxxxxxx", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "cod.PNG", "you lose.");
      g.convert(lost);
   
   }
   
   public static void win(GUI g){
      Branch win = new Branch(0,0,"YEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "SO PROUD", "morgannn.jpg", "WINNER");
      g.convert(win);
         
   }




}
