import java.util.*;
import java.util.ArrayList;
import java.util.Scanner; 

public class Game{

   public static void main(String args[]){
            
      //gets the player's name and age and creates a new player
      Scanner scan = new Scanner(System.in); 
      System.out.println("Enter name: ");
      String name = scan.nextLine();
      System.out.println("Enter age: ");
      int age = scan.nextInt();
      Player p1 = new Player(name, age);
      
      //stores all the different planets they have been to
      ArrayList<Integer> progress = new ArrayList<Integer>();
      Branch currentWorld = p1.startGame();
      progress.add(currentWorld.getCode());
      
      //plays the game if the player is alive
      if(p1.isLiving() == true){
         int level = 0;
         while(p1.isLiving() == true && (currentWorld.getStatus() == false)){
            Branch world = new Branch(level);
            currentWorld = world;
            p1.setLoc(currentWorld.getName());
            currentWorld.playGame();
               if(currentWorld.getPass() == true){
                  level++;
                  progress.add(currentWorld.getCode());
                  p1.live();
               }
               else{
                  p1.die();
               }   
         }
         if(p1.isLiving() == false){
            System.out.println("you lost the game!");
         }
      
         else{
            System.out.println("you won the game");
         }             
      }
   }
}
