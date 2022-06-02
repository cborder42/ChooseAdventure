import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class School{


   public static void loopSchool(GUI g){
      Player p = g.getPlayer();
      int code = p.getCode2();
      if(p.getCode1()==3){
         if (code==0){
            school0(g);
         
         }
         if (code==1){
            school1(g);
         
         }
         else if (code==2){
            school2(g);
         }
         else if (code==3){
         
            school3(g);
         }
         else if (code==4){
            school4(g);
         }
         else if(code==5){
            school5(g);
         }
         else if (code==6){
            school6(g);
         }
         else if (code==7){
            school7(g);
         }
         else if (code==8){
            school8(g);
         }
         else if (code==9){
            school9(g);
         }
         else if (code==10){
            school10(g);
         
         }
         else if (code==11){
            school11(g);
         
         }
         else if (code==12){
            school12(g);
         
         }
         else if (code==13){
            school13(g);
         
         }
         else if (code==14){
            school14(g);
         
         }
         else if (code==15){
            school15(g);
         
         }
         else if (code==16){
            school16(g);
         
         }
         else if (code==17){
            school17(g);
         
         }
         else if (code==18){
            school18(g);
         
         }
         else if (code==19){
            school19(g);
         
         }
         else if (code==20){
            school20(g);
         
         }
         else if (code==21){
            school21(g);
         
         }
      }
   
   }
  
      
  
   public static void findNextSchool(GUI g){
      Player p = g.getPlayer();
      int c = p.getCode2();
      int op = p.getOp();
      if((c == 100)){
                 
      
      }
      
      
     
      else {
      
         g.getPlayer().setLCode1(g.getPlayer().getCode1());
         g.getPlayer().setLCode2(g.getPlayer().getCode2());
         if(c==11){
            if(op==1){
               p.addBpt(1);
                        
            }
            p.setCode2(0);
         }
         
         
         else if (c==0){
            if(op==1){
               p.setCode2(1);
            
            }
            else{
               p.setCode2(2);
            }
         
         }
                  
         else if((c ==2)||(c==1)){
            p.setCode2(3);
   
         
         }
         else if((c ==3)){
            if(op==1){
               p.setCode2(4);
            
            }
            else{
              p.setCode2(5);
            
            }
         
         }
         
         else if (c==4){
            if(op==1){
               p.setCode2(6);
            
            }
            else{
               p.setCode2(10);
               p.addBpt(-3);
            
            }
         
         
         }
         else if (c==5){
            p.setCode2(10);
         
         }
         
         else if (c==6){
            if(op==1){
               p.setCode2(8);
            
            }
            else{
               p.setCode2(7);
            }
         
         }
         
         else if((c==7)||(c==8)){
            
            p.setCode2(9);
         
         }
         else if(c==9){
            p.setCode2(10);
         
         }
         
         else if(c==10){
           p.setCode2(12);
         
         }
         else if(c==12){
            if(op==1){
               p.setCode2(13);
            }
            else{
               p.setCode2(14);
            }
         
         }
         else if((c==13)||(c==14)){
            if(op==1){
               p.addMpt(3);
            }
            p.setCode2(15);
         
         }
         else if(c==15){
            if(op==2){
               p.addMpt(1);
            }
            
             p.setCode2(16);
            
         
         }
         
         else if(c==16){
            if(op==1){
               p.addMpt(5);
               p.setCode2(21);
            }
            else{
               p.setCode2(17);
            }
         
         }
         else if(c==17){
            if(op==1){
               
               p.setCode2(21);
            }
            else{
               p.setCode2(18);
            }
         
         }
         else if(c==18){
            if(op==1){
               
               p.setCode2(21);
            }
            else{
               p.setCode2(19);
            }
         
         }
         else if(c==19){
            if(op==1){
               
               p.setCode2(21);
            }
            else{
               p.setCode2(20);
            }
         
         }
         else if(c==20){
            p.setCode2(21);
           
         }
         else if(c==21){
            Dorm.dorm0(g);
         
         }
         
         
         
         
         
        
         loopSchool(g);
         
      
      
      }
      
   }
   
         
      
      
      
      
   public static void school11(GUI g){
      Branch school11 = new Branch(3,11, "politely", "angrily", "school11.PNG", "You got to your first class: Dance class. There you see a couple of people: Blair and Nicholas. How do you introduce yourself?");
      g.convert(school11);
   
   }
     
   public static void school0(GUI g){
   
      Branch school0 = new Branch(3,0, "Sit Out", "Dance with Blair", "school0.PNG", "Now that introductions are over, it is time for the class to start. What do you do?");
      g.convert(school0);
   
   }
 
   public static void school1(GUI g){
   
      Branch school1 = new Branch(3, 1, "that was nice", "cats are the best", "school1.PNG", "You sit content on the side of the room, watching cat videos. What do you think of the experience?");
      g.convert(school1);  
   
   }
   
   public static void school2(GUI g){
   
      Branch school2 = new Branch(3, 2, "you are glad you danced with Blair", "you wish you never danced with Blair", "school2.PNG", "You finished dancing with Blair! How do you feel?");
      g.getPlayer().addBpt(5);
      g.convert(school2);  
   
   }
   
   public static void school3(GUI g){
   
      Branch school3 = new Branch(3, 3, "Compliment her hair", "Ask her about crowns", "school3.PNG", "After the dance ends, Blair approaches you to talk. What do you do?");
      g.convert(school3);  
      
   
   }
   
   public static void school4(GUI g){
   
      Branch school4 = new Branch(3, 4, "accept", "refuse", "school4.PNG", "Blair appreciates your compliment and requests you come get cupcakes with her. What do you do?");
      g.getPlayer().addBpt(5);
      g.convert(school4);  
   
   }
   
   public static void school5(GUI g){
   
      Branch school5 = new Branch(3, 5, "awkwardly leave", "say \"haha cool...\" and wait for her to exit the situation", "school5.PNG", "Blair seems slightly off-put by your question and simply responds saying \"ummmm I don't know anything about crowns......\". What do you do?");
      g.getPlayer().addBpt(-1);
      g.getPlayer().addMpt(1);
      g.convert(school5);  
   
   }
   
   public static void school6(GUI g){
   
      Branch school6 = new Branch(3, 6, "Ask her about Nicholas", "Ask her about her family", "school6.PNG", "Once you have gotten your cupcakes with Blair, you have another chance to talk to her. What do you do?");
      g.getPlayer().addBpt(5);
      g.convert(school6);  
      
   
   }
   
   public static void school7(GUI g){
      Branch school7 = new Branch(3,7, "\"oh wow I love wolves\"", "\"that's weird...\"", "school7.PNG", "Blair tells you about how, though she doesn't know her biological parents, she was raised by a pack of wolves in a nearby forest. What do you say in response?");
      g.getPlayer().addBpt(1);
      g.convert(school7);
   
   }
   
   public static void school8(GUI g){
      Branch school8 = new Branch(3,8, "Wow he is so cool.", "He seems overrated", "school8.PNG", "Blair tells you about how Nicholas is a cool prince who is the son of the headmaster at the school. What are your thoughts on Nicholas?");
      g.getPlayer().addBpt(3);
      g.convert(school8);
   
   
   }
   
   public static void school9(GUI g){
      Branch school9 = new Branch(3,9, "sigh and smile, knowing you are now free of her presence", "sit in silence for 45 seconds", "school9.PNG", "After chatting with you for a while longer, Blair heads out to go to her dorm. What do you do?");
      g.convert(school9);
   
   
   }
   
   
   public static void school10(GUI g){
      Branch school10 = new Branch(3,10, "your dorms", "the cafeteria", "school10.PNG", "You decide to start walking around the school for a bit. Where do you go?");
      g.convert(school10);
   
   }
   
   public static void school12(GUI g){
      Branch school12 = new Branch(3,12, "go to Dame Devin", "ignore Dame Devin", "school12.PNG", "Suddenly as you are walking down the hall you see Dame Devin. She motions you to come over. What do you do?");
      g.convert(school12);
   
   }
   
   public static void school13(GUI g){
      Branch school13 = new Branch(3,13, "\"It's good to see you!\"", "\"Why are you here?\"", "school13.PNG", "After you walk over to Dame Devin, she pulls you into a secret alleyway where you are alone. What do you say to her?");
      g.getPlayer().addMpt(10);
      g.convert(school13);
   
   }
   
   public static void school14(GUI g){
      Branch school14 = new Branch(3,14, "\"It's good to see you!\"", "\"Why are you here?\"", "school14.PNG", "Though you try to stay away from Dame Devin, she manages to pull you into a secret alleyway where you are alone. What do you say to her?");
      g.getPlayer().addMpt(-5);
      g.convert(school14);
   
   }
   
   public static void school15(GUI g){
      Branch school15 = new Branch(3,15, "appear disinterested", "look intrigued", "school15.PNG", "Ignoring what you said, Dame Devin jumps into explanation. She tells you that she is here to tell you about her new plan. What do you do?");
      
      g.convert(school15);
   
   }
   
   public static void school16(GUI g){
      Branch school16 = new Branch(3,16, "agree immediately", "refuse to do this", "school16.PNG", "Dame Devin tells you that she plans to create a fake fire at the school tomorrow, and that while everyone is gone to find safety, you should hide a necklace in Blair's dorm. This would frame Blair to have stolen the jewelry.");
      
      g.convert(school16);
   
   }
   public static void school17(GUI g){
      Branch school17 = new Branch(3,17, "accept", "refuse", "school17.PNG", "Though you initially refused, Dame Devin now bribes you to do this with $500. What do you do?");
      g.getPlayer().addMpt(2);
      g.convert(school17);
   
   }
   public static void school18(GUI g){
      Branch school18 = new Branch(3,18, "accept", "refuse", "school18.PNG", "While now slightly annoyed, Dame Devin raises her bribe to $1000");
      g.getPlayer().addMpt(1);
      g.convert(school18);
   
   }
   public static void school19(GUI g){
      Branch school19 = new Branch(3,19, "accept", "refuse", "school19.PNG", "Now visibly angry, Dame Devin offers $2000");
      
      g.convert(school19);
   
   }
   public static void school20(GUI g){
      Branch school20 = new Branch(3,20, "accept", "accept", "school20.PNG", "This seems to have been Dame Devin's snapping point as she now threatens you, pressuring you to accept");
      g.getPlayer().addMpt(-1);
      g.convert(school20);
   
   }
   
   public static void school21(GUI g){
      Branch school21 = new Branch(3, 21, "content", "confused", "school21.PNG", "Dame Devin joyfully sends you off, telling you to meet her right after you hide the necklace. With your new task, you set off to your dorm to settle in and prepare for tomorrow. How do you feel?");
      g.convert(school21);
   
   }
  
 
 
     
   
   
   public static void lost(GUI g){
      Branch lost = new Branch(35,100,"restart section", "go to last option", "cod.PNG", "you lose.");
      g.convert(lost);
   
   }
   
   public static void win(GUI g){
      Branch win = new Branch(0,0,"YEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "SO PROUD", "morgannn.jpg", "WINNER");
      g.convert(win);
         
   }




}
