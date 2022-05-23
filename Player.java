//player class
//code for a player object which is what will go through all the different branches of stories
import java.util.*;

public class Player{
  
  
  //instance variables
  private String name;
  private String location;
  private int age;
  private boolean dead;
  private boolean dogPet;
  private boolean winner;
    
  
  //constructor/s
  public Player(){
      location = "Chris's room";
      name = "Bob";
      age = 94;
      dead = true;
      dogPet = false;
      winner = false;
  }
  public Player(String n, int a){
    location = "Chris's room"; 
    name = n;
    age = a;
    dead = true;
    dogPet = false;
    winner = false;
  }
  
  public Player(String l, String n, int a, boolean d){
    location = l;
    name = n;
    age = a;
    dead = d;
    dogPet = false;
    winner = false;
  }
  
  
  //accessor methods
  
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
      return dead;
  
  }
  
  //returns if player has pet the dog
  public boolean hasPet(){
     return dogPet();
  }
  
  //returns if the player has won the game or not
  public boolean hasWon(){
    return winner;
    
  }
  
  
  // mutator methods
  
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
      dead = d;
      
  }
  
  // sets player's dead to true
  public void die(){
      dead = true;
  
  }
  
  // sets player's dead to false
  public void live(){
      dead = false;
  
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
    
    
  
  
  
