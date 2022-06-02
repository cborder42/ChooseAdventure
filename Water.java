import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Water{


   public static void loopWater(GUI g){
      Player p = g.getPlayer();
      int code = p.getCode2();
      if(p.getCode1() == 3){
         if (code == 0){
            water0(g);
         
         }
         if (code == 1){
            water1(g);
         
         }
         else if (code == 2){
            water2(g);
         }
         else if (code == 3){
         
            water3(g);
         }
         else if (code == 4){
            water4(g);
         }
         else if(code == 5){
            water5(g);
         }
         else if (code == 6){
            water6(g);
         }
         else if (code == 7){
            water7(g);
         }
         else if (code == 8){
            water8(g);
         }
         else if (code == 9){
            water9(g);
         }
         else if (code == 10){
            water10(g);
         
         }
         else if (code == 11){
            water11(g);
         
         }
         else if (code == 12){
            water12(g);
         
         }
         else if (code == 13){
            water13(g);
         
         }
         else if (code == 14){
            water14(g);
         
         }
         else if (code == 15){
            water15(g);
         
         }
         else if (code == 16){
            water16(g);
         
         }
         else if (code == 17){
            water17(g);
         
         }
         else if (code == 18){
            water18(g);
         
         }
         else if (code == 19){
            water19(g);
         
         }
      }
   
   }
  
      
     public static void findNextWater(GUI g){
      Player p = g.getPlayer();
      int c = p.getCode2();
      int op = p.getOp();
          
       g.getPlayer().setLCode1(g.getPlayer().getCode1());
       g.getPlayer().setLCode2(g.getPlayer().getCode2());
       if(c==0){
            if(op==1){
               p.setCode2(1);
                        
            }
            else{
               p.setCode2(2);             
            }
            
         }
         
         
         else if (c==1){
            if(op==1){
               p.setCode2(3);
                        
            }
            else{
               p.setCode2(4);             
            }
            
                     
         }
                  
         else if(c==2){
             if(op==1){
               p.setCode2(3);
                        
            }
            else{
               p.setCode2(4);             
            }
   
         
         }
         else if(c ==3){
            p.setCode2(5);         
         }
         
         else if (c == 4){
            p.setCode2(6);
              
         }
         
         else if (c == 5){
            
            if(op==1){
               p.setCode2(7);
                        
            }
            else{
               p.setCode2(8);             
            }
              
         }         
         
         else if(c==6){
            
            p.setCode2(3);            
         
         }
         
         else if( c == 7) {
         
            p.setCode2(8);
         
         }
         else if(c==8){
            if(op==1){
            
               p.setCode2(9);
            }   
            
            else{
               p.setCode2(10);
            
            }    
         }
         
         else if(c==9){
          if(op==1){
               p.setCode2(10);
           }
           p.setCode2(13);
         
         }
         else if(c==10){
            
            if(op==1){
               p.setCode2(11);
            }
            else{
               p.setCode2(12);
            }
            
         
         }
         
         else if(c==11){
         
             p.setCode2(12);
         }
         
         else if(c==12){
            
            p.setCode2(14);
         }
         
         else if(c==13){
            if(op==1){
               p.setCode2(11);
            }
            
             p.setCode2(12);
            
         
         }
         
         else if(c==14){
         
             if(op==1){
               p.setCode2(15);
            }
            
             p.setCode2(16);
 
         }            
                     
         else if(c==15||c==16){
         
            p.setCode2(17);
         }
         
         else if(c==17){
         
             if(op==1){
               p.setCode2(18);
            }
            
             win(g);
 
         } 
         
         else if(c==18){
            if(op==1){
               lost(g);
            }
            
             p.setCode2(19);
 
         } 
        
         else if(c==19){
            
            if(op==1){
               lost(g);
            }
            
             win(g);
 
         }
                            
         loopWater(g);
     
   }
   

     
   public static void water0(GUI g){
   
      Branch water0 = new Branch(2,0, "go to the bathroom while he is talking", "go after he finishes", "water0.PNG", "You arrive to your daily compsci class but realize you have to go to the bathroom but Chris is in the middle of one of his long lectures.");
      g.convert(water0);
   
   }
 
   public static void water1(GUI g){
   
      Branch water1 = new Branch(2, 1, "Run back to the bathroom to cry", "Stand up for yourself and challenge him to an arm wrestle!", "water1.PNG", "You made it just in time, you relieve youself, but when you return Chris is MADDDDD!!!!");
      g.convert(water1);  
   
   }
   
   public static void water2(GUI g){
   
      Branch water2 = new Branch(2, 2, "Run to the bathroom to clean up and cry", "Wipe your pee then stand up for yourself and challenge Chris to an arm wrestle!", "water2.PNG", "... You could not hold it long enough and end up peeing in class and Chris is MADDDD!!!!");
      
      g.convert(water2);  
   
   }
   
   public static void water3(GUI g){
   
      Branch water3 = new Branch(2, 3, "Hot tub session in the toilet while reading your favorite book", "eat some chocolate you stole from Chris the other day", "dorm3.PNG", "You ran to the bathroom and you are crying what do you do to calm yourself down?");
      g.convert(water3);  
      
   
   }
   
   public static void water4(GUI g){
   
      Branch water4 = new Branch(2, 4, "left hand", "right hand", "water4.PNG", "You walk up confidently you know you can beat him with either hand. Which one do you want to use?");
      g.convert(water4);  
   
   }
   
   public static void water5(GUI g){
   
      Branch water5 = new Branch(2, 5, "you decide to scream for help", "you attempt to swim down the toilet to find out a cure for your poopiness", "water5.PNG", "You wake up and you are a brown, stinky, slimy piece of POOP!!! WHAT DO YOU DO?");
      
      g.convert(water5);  
   
   }
   
   public static void water6(GUI g){
   
      Branch water6 = new Branch(2, 6, "run to the bathroom crying", "say you were going easy on him and go to the bathroom", "water6.PNG", "you LOSE :( Chris beats you in the arm wrestle and you are humiliated.");
      
      g.convert(water6);  
      
   
   }
   
   public static void water7(GUI g){
      Branch water7 = new Branch(2,7, "CHRIS NOOOOOOOOOOOOOOOO", "AGHHHHHHHHHH", "water7.PNG", "You scream for help right as Chris comes in and he is still mad at you so he decides to flush you down the toilet! You get flushed and everything blurs as the water splashes and you zoom through the pipes!");
    
      g.convert(water7);
   
   }
   
   public static void water8(GUI g){
      Branch water8 = new Branch(2,8, "left", "right", "water8.PNG", "You end up making you way down the pipes and it gets difficult to see but you can feel the sides of the tubes, you continue to make you way down until you reach a split in the road, which way do you want to go?");
   
      g.convert(water8);
   
   
   }
   
   public static void water9(GUI g){
      Branch water9 = new Branch(2,9, "join the party!!!", "be a party POOPer and go back the other way", "water9.PNG", "You chose to go left... you reach a room with lots of poop, they all turn to stare and ask you to join their party.");
      g.convert(water9);
   
   
   }
   
   
   public static void water10(GUI g){
      Branch water10 = new Branch(2,10, "tell the others and go after Chris", "don't tell the others and leave quietly", "water10.PNG", "Time to partyyyy!!!! Soon you realize that these were the other missing students from Chris's class and realized he has cursed you because you made him mad!");
      g.convert(water10);
   
   }
   
   public static void water11(GUI g){
      Branch water11 = new Branch(2,11, "ditch them and keep going!", "keep trying together", "water11.PNG", "When you guys try to go after him there are too many poops in the pipe at once and you guys clog it!");
      g.convert(water11);
   
   }
   
   public static void water12(GUI g){
      Branch water12 = new Branch(2,12, "CELEBRATEEEEEE", "SCREAM WOOHOOOOOOOOOO I MADE IT", "water12.PNG", "You remember passing by a stinky area on your way to class, and you were right there is a leak! you escape the pipes through that leak");
      g.convert(water12);
   
   }
   

   
   public static void water13(GUI g){
      Branch water13 = new Branch(2,13, "BANG ON THE WINDOW AND LET THEM KNOW THAT CHRIS CURSED THEM AND YOU NEED TO GET REVENGE", "stay quiet and find your own way out", "water13.PNG", "You see a light and you realize it is a one-way window in the pipes, you can see a party going on on the other side and as you stare longer you realize they are other poops! You try to listen and hear a familiar voice.. You realize they were your old classmates!");
      g.convert(water13);
   
   }
   
   public static void water14(GUI g){
      Branch water14 = new Branch(2,14, "you decide to hijack the golf cart", "you roll your way over to the classroom", "water14.PNG", "What is the fastest way to get to the classroom?");
      
      g.convert(water14);
   
   }
   
   public static void water15(GUI g){
      Branch water15 = new Branch(2,15, "SHUT IT ive got bigger problems than you!", "SORRY THIS IS MY DUTY!", "water15.PNG", "You can hear people screaming and you scream back:");
      
      g.convert(water15);
   
   }
   
   public static void water16(GUI g){
      Branch water16 = new Branch(2,16, "I AGREE THIS IS WHY THE CAMPUS ALWAYS STINKS", "you would say the same thing if you smelled yourself", "water16.PNG", "you can hear people saying that you smell what do you say back to them?");
      
      g.convert(water16);
   
   }
   public static void water17(GUI g){
      Branch water17 = new Branch(2,17, "you come in screaming and threaten him to turn you back", "you say you are really sorry and that you love his class so so so much", "water17.PNG", "You arrive and you see Chris sitting in his classroom! What do you do???");     
      g.convert(water17);
   
   }
   public static void water18(GUI g){
      Branch water18 = new Branch(2,18, "NOOOOOOOOO", "I CURSE YOU TOO!", "water18.PNG", "Chris screams back and traps you in the JENGA case you've seen on his desk, you realize there are stains from previous students. Chris tells you that you will never become human again...");
      g.convert(water18);
   
   }
  
   public static void water19(GUI g){
      Branch water19 = new Branch(2,19, "no", "yes", "water19.PNG", "Now you guys are both poop do you want to make a deal and turn eachother back?");
      g.convert(water19);
   }
   
   public static void lost(GUI g){
      Branch lost = new Branch(35,100,"restart section", "you died", "cod.PNG", "you lose.");
      g.convert(lost);
   
   }
   
   public static void win(GUI g){
      Branch win = new Branch(0,0,"YEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "SO PROUD", "morgannn.jpg", "CHRIS SWITCHES YOU BACK INTO A HUMAN YAYYYY AND GIVES YOU A HUNDRED ON THE COMPSCI ASSIGMENT!!!!");
      g.convert(win);
         
   }

     
} 

   
