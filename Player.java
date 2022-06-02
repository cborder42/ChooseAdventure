//player class
//code for a player object which is what will go through all the different branches of stories
import java.util.*;

public class Player{
  
  
  //instance variables
  private String name;
  private String location;
  private int age;
  private boolean alive;
  private boolean dogPet;
  private boolean winner;
  //holds the location of the player, code1 is the main branch and code2 is the subbranch
  private int code1;
  private int code2;
  //holds the option chosen by the user
  private int op;
  //variables to hold the previous location of the player, follows the same pattern as the codes, just lcode instead
  private int lcode1;
  private int lcode2;
  private boolean necklace;
  private int mpt;
  private int bpt;
    
  
  //constructor/s
  public Player(){
      location = "Chris's room";
      name = "Bob";
      age = 94;
      alive = true;
      dogPet = false;
      winner = false;
      code1 = 0;
      code2 = 0;
      lcode1 = 1;
      lcode2 = 0;
      op = 0;
      mpt=0;
      bpt=0;
      necklace=false;
      
  }
  public Player(String n, int a){
    location = "Chris's room"; 
    name = n;
    age = a;
    alive = true;
    dogPet = false;
    winner = false;
    code1 = 0;
    code2 = 0;
    lcode1 = 1;
    lcode2 = 0;
    op = 0;
    mpt=0;
    bpt=0;
    necklace=false;
  }
 
  
  
  //accessor methods
  public int getMpt(){
   return mpt;
  
  }
  
  public int getBpt(){
   return bpt;
  
  }
  
  public boolean getNecklace(){
    return necklace;
    
    
  }
  //return the last locations
  public int getLCode1(){
   return lcode1;
  
  }
  
  public int getLCode2(){
   return lcode2;
  
  }
  //returns the code of the current location as corresponds w/ branch numbers, only 1 code may be necessary, depends
  public int getCode1(){
      return code1;
    
  }
  
  public int getCode2(){
    return code2();
    
  }
  
  // returns the current choice of the player, option 1 or 2
  public int getOp(){
    return op;
    
  }
  
  //returns the player's name
  public String getName(){
      return name;
  
  }
  
  
  // returns the player's location
  public String getLoc(){
      return location;
  
  }
  
  // returns the player's age
  public int getAge(){
      return age;
  
  }
  
  
  // returns if the player is living
  public boolean isLiving(){
      return alive;
  
  }
  
  //returns if player has pet the dog
  public boolean hasPet(){
     return dogPet;
  }
  
  //returns if the player has won the game or not
  public boolean hasWon(){
    return winner;
    
  }
  
  
  // mutator methods
  
  
  public void setMpt(int i){
   mpt=i;
  
  }
  public void setBpt(int i){
   bpt=i;
  
  }
  
  public void addMpt(int i){
  
   mpt+=i;
  }
  
  public void addBpt(int i){
   bpt+=i;
  
  }
  
  public void setNecklace(boolean b){
    necklace = b;
    
  }
  //sets the last location
  public void setLCode1(int i){
   lcode1 = i;
  
  }
  
  public void setLCode2(int i){
   lcode2 = i;
  
  }
  //sets current location
  public void setCode1(int i){
    code1 = i;
      
  }
  
  public void setCode2(int i){
      code2 = i;
    
  }
  
  public void setOp(int i){
    op = i;
    
  }


  // sets name of player
  public void setName(String n){
      name = n;
  
  }
  
  // sets the location of player
  public void setLoc(String l){
      location = l;
  
  }
  
  // sets the age of player
  public void setAge(int a){
      age = a;
  
  }
  
  //increases players age by given amount
  public void ageUp(int up){
      age+=up;
  
  }
  
  //decreases players age by given amount
  public void ageDown(int down){
      age-=down;
  
  }
  
  // sets the status of player for death
  public void setDead(boolean d){
      alive = d;
      
  }
  
  // sets player's alive to true
  public void live(){
      alive = true;
  
  }
  
  // sets player's alive to false
  public void die(){
      alive = false;
  
  }
  
  // sets player's to having pet the dog
  public void petDog(){
    dogPet = true;
    
  }
  
  // set's players status to having won the game
  public void winGame(){
    winner = true;
  }
  
  

  
  
}
    
    
  
  
  
