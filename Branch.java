//branches super class that will hold all the different branches

import java.util.*;
import java.util.Scanner; 

public class Branch{

   private int code;
   private String name; 
   private boolean pass;
   private boolean hasWon;
   private static int level;
   
   public Branch(int c){
   
      code = c;
      convertNumtoString(c);
      level++;
      hasWon = false;
      
   }
   
   public int getCode(){
   
      return code;
      
   }
   
   public String getName(){
      return name;
   }
   
   public boolean getPass(){
      return pass;
   }
   
   public boolean getStatus(){
      return hasWon;
   }
   
   public void passLevel(){
      
      pass = true;
      
   }
   
   public void failLevel(){
   
      pass = false;
      
   }
   
   public Branch moveOn(int a){
   
      Branch newLevel = new Branch(a);
      return newLevel;
   
   }
   
   public void convertNumtoString(int a){
   
      if(a == 0){
         name = "APCS Classroom";
      }

      if(a == 1){
         name = "Chris Border Planet";
      }
      
      if(a == 2){
         name = "Water planet";
      }
      
   }
   
   public void playGame(){
      
      Scanner scan = new Scanner(System.in); 
      
      if(code == 0){
         System.out.println("will you go to class?");
         String answer = scan.nextLine();
         if(answer.equals("yes")){
            pass = true;
         }
         else{
            pass = false;
         } 
      }

      else if(code == 1){
         System.out.println("what do you want to wear?");
         System.out.println("plaid");
         System.out.println("checkered");
         System.out.println("monochrome");         
         String answer = scan.nextLine();
         if(answer.equals("plaid")){
            pass = true;

         }
         else{
            pass = false;
         }
      }
      
      else if(code == 2){
         System.out.println("you just pooped can you please flush the toilet?");
         String answer = scan.nextLine();
         if(answer.equals("yes")){
            pass = true;
         }
         else{
            pass = false;
         }
      }  
      
      else{
         hasWon = true;
      } 
 }
 }
      
