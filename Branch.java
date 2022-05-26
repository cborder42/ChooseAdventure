//branches super class that will hold all the different branches

import java.util.*;
import java.util.Scanner; 

public class Branch{

   private int code1;
   private int code2;
   private String name; 
   private boolean pass;
   private boolean hasWon;
   private static int level;
   private String op1;
   private String op2;
   private String imageSpot;
   private String label;
   
   public Branch(int c1, int c2){
   
      code1 = c1;
      code2 = c2;
      convertNumtoString(c1);
      name+= code2;
      pass = false;
      hasWon = false;
      
   }
   
   public Branch(int c1, int c2, String o1, String o2, String imag, String lab){
      code1 = c1;
      code2 = c2;
      convertNumtoString(c1);
      name+= " " + code2;
      pass = false;
      hasWon = false;
      op1 = o1;
      op2 = o2;
      imageSpot = imag;
      label = lab;
   }
   
   
   public int getCode1(){
   
      return code1;
      
   }
   
   public int getCode2(){
      return code2;
   }
   
   public String getOp1(){
      return op1;
   
   }
   
   public String getOp2(){
      return op2;
   }
   
   public String getLabel(){
   
      return label;
   }
   
   public String getImage(){
      return imageSpot;
   
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
       
     
 }
  
