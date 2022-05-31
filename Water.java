import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Water{
   
  
   // the searchCave method contains the branches created within the main branch. it takes a GUI object as a parameter which is just the GUI object of the game being played

   public static void searchWater(GUI g){
     
      //it uses an array of branch objects
      Branch[] water = new Branch[6];
      Branch water1 = new Branch(2, 1, "yes", "no", "water1.PNG", "can you swim?");
      Branch water2 = new Branch(2, 2, "yes", "no", "water2.PNG", "would you like a boat");
      Branch water3 = new Branch(2, 3, "left", "right", "water3.PNG", "do you want to go left or right?");
      Branch water4 = new Branch(2, 4, "yes", "no", "water4.PNG", "do you want to try?");
      Branch water5 = new Branch(2, 5, "sail", "motor", "water5.PNG", "sail or a motor");
      Branch water6 = new Branch(2, 6, "yes", "no", "water6.PNG", "do you think you will make it?");
      water[0] = water1;
      water[1] = water2;
      water[2] = water3;
      water[3] = water4;
      water[4] = water5;
      water[5] = water6;
      
      // it takes the second code of the player which directs it to the subbranch within the cave class 
      //does this by directing the player to one part of the array of branches
      int count = g.getPlayer().getCode2();
     
      //it then calls the convert(Branch b) method from the GUI class to change all the variables and such (more info in GUI class)
      g.convert(water[count-1]);      
      
      
      
   
   
   }
  
      
  
   //the findNextCave method is where the code is first directed in this class after a button is clicked
  
   public static void findNextWater(GUI g){
     
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
      else if((p.getCode2() ==3)&& (p.getOp()==1)){
         win(g);
      
      }
      
     
      else{
         lost(g);
      
      }
           
     //it then calls the searchWater method (above) to play, run, update next branch whatever stuff
      
      searchWater(g);
      
      
   }
 
   
   //these are methods that could be called for if the player lost or something
   public static void lost(GUI g){
      
       if(p.getCode2()==3){
         if(p.getOp()==2){
            Branch lost = new Branch(0,0,"XXX", "XXX", "cod.PNG", "oh no! there was a waterfall!!!!");
         
         }
      }
      
      else if(p.getCode2()==4){
         if(p.getOp()==1){
            Branch lost = new Branch(0,0,"XXX", "XXX", "cod.PNG", "idiot you can't swim why would you even try?");
         
         }
         else{
            Branch lost = new Branch(0,0,"XXX", "XXX", "cod.PNG", "you should have tried maybe you would have won...");
         }
      
      }
      
      else if(p.getCode2()==5){
         if(p.getOp()==1){
            Branch lost = new Branch(0,0,"XXX", "XXX", "cod.PNG", "the sails were ripped bye bye");
         
         }
         else{
            Branch lost = new Branch(0,0,"XXX", "XXX", "cod.PNG", "thats bad for the enviornment shame on you...");
         }
      
      }
      
       else if(p.getCode2()==6){
         if(p.getOp()==1){
            Branch lost = new Branch(0,0,"XXX", "XXX", "cod.PNG", "oh the confidence thats embarrassing");
         
         }
         else{
            Branch lost = new Branch(0,0,"XXX", "XXX", "cod.PNG", "you were right! straight off the waterfall yay!");
         }
      
      }
      
      g.convert(lost);
   
   }
   
   public static void win(GUI g){
      Branch win = new Branch(0,0,"YEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "SO PROUD", "morgannn.jpg", "WINNER WINNER!!! THAT IS RARE SO CONGRATS");
      g.convert(win);
         
   }




}
