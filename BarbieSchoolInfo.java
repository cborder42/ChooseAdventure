import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BarbieSchoolInfo{


   public static void loopbarb(GUI g){
     
      Player p = g.getPlayer();
      int code = p.getCode2();
      if(p.getCode1()==1){
         if(code==0){
            
            intro0(g);
         }
         if (code==1){
            intro1(g);
         
         }
         else if (code==2){
            intro2(g);
         }
         else if (code==3){
         
            intro3(g);
         }
         else if (code==4){
            intro4(g);
         }
         else if(code==5){
            intro5(g);
           
         }
         else if (code==6){
            intro6(g);
         }
         else if (code==7){
            intro7(g);
         }
         else if (code==8){
            intro8(g);
         }
         else if (code==9){
            intro9(g);
            
         }
         else if (code==10){
            intro10(g);
            }
         else if (code==11){
            intro11(g);
          
         }
         else if (code==12){
            intro12(g);
         }
         else if (code==13){
            intro13(g);
            
         }


      }
      if(p.getCode1()==5){
         if(code==0){
            nextDay0(g);
         }
         if (code==1){
            nextDay1(g);
         }
         else if (code==2){
            nextDay2(g);
         }
         else if (code==3){
         
            nextDay3(g);
         }
         else if (code==4){
            nextDay4(g);
            
         }
         else if(code==5){
            nextDay5(g);
            
         }
         else if (code==6){
            nextDay6(g);
         }
         else if (code==7){
            nextDay7(g);
           
         }
         else if (code==8){
            nextDay8(g);
            
         }
         else if (code==9){
            nextDay9(g);
         }
         else if (code==10){
            nextDay10(g);
          
         }
         else if (code==12){
            nextDay12(g);
         }
         else if (code==13){
            nextDay13(g);
         }
         else if (code==14){
            nextDay14(g);
         }
         else if (code==15){
            nextDay15(g);
         }
         else if (code==16){
            nextDay16(g);
         }
         else if (code==17){
            nextDay17(g);
         }
         else if (code==18){
            nextDay18(g);
         }
         else if (code==19){
            nextDay19(g);
         }
         else if (code==20){
            nextDay20(g);
         }
         else if (code==21){
            nextDay21(g);
         }
         else if (code==22){
            nextDay22(g);
         }
          else if (code==23){
            nextDay23(g);
         }
      }
      if(p.getCode1()==6){
         if(code==0){
            final0(g);
         }
         else if (code==1){
            final1(g);
         
         }
         else if (code==2){
            final2(g);
         }
         else if (code==3){
         
            final3(g);
         }
         else if (code==4){
            final4(g);
         }
         else if(code==5){
            final5(g);
         }
         else if (code==6){
            final6(g);
         }
         else if (code==7){
            final7(g);
         }
         else if (code==8){
            final8(g);
         }
         else if (code==9){
            final9(g);
         }
         else if (code==10){
            final10(g);
         }
         else if (code==11){
            final11(g);
         }
         else if (code==12){
            final12(g);
         }
         else if (code==13){
            final13(g);
         }
         else if (code==14){
            final14(g);
         }
         else if (code==15){
            final15(g);
         }
  

      }
     
   
   }
  
      
  
   public static void findNextbarb(GUI g){
   
     Player p = g.getPlayer();
     g.getPlayer().setLCode1(g.getPlayer().getCode1());
     g.getPlayer().setLCode2(g.getPlayer().getCode2());
     
     if(p.getCode1()==1){
         if (p.getCode2()==0){
               
               p.setCode2(1);
               

           
         }
         else if(p.getCode2()==1){
               p.setCode2(2);
         
         }
         
         else if(p.getCode2() ==2){
               p.setCode2(3);
         
         }
         else if(p.getCode2()==3){
            if(p.getOp()==1){
               p.setCode2(4);
            }
            else{
               p.setCode2(6);
            }
         }
         else if(p.getCode2()==4){
            if(p.getOp()==1){
               p.addMpt(3);
               p.setCode2(13);
            }
            else{
               p.setCode2(5);
            }
         }
         else if(p.getCode2()==5){
              p.addMpt(5);
              p.setCode2(13);
         }
         else if(p.getCode2()==6){
            p.setCode2(7);
            p.addBpt(5);
         }
          else if(p.getCode2()==7){
            p.setCode2(8);
            p.addMpt(-3);
         }
          else if(p.getCode2()==8){
            if(p.getOp()==1){
            p.setCode2(13);
            }
            else{
               p.setCode2(9);
            }

         }
         else if(p.getCode2()==9){
         p.addMpt(3);
           if(p.getOp()==1){
              p.setCode2(13);  
           }
            else{
               p.setCode2(10);
            }
         }
         else if(p.getCode2()==10){
         p.addMpt(3);
           if(p.getOp()==1){
              p.setCode2(13);        
            }
            else{
               p.setCode2(11);
            }
         }
         else if(p.getCode2()==11){
         p.addMpt(1);
           if(p.getOp()==1){
              p.setCode2(13);         
            }
            else{
               p.setCode2(12);
            }
         }
         else if(p.getCode2()==12){
             p.setCode2(13);
         }  
         else if(p.getCode2()==13){
             School.school11(g); //school section here
         }  
         }     
         
         else if(p.getCode1()==5){
         
            if (p.getCode2()==0){
               if(p.getOp()==1){
                  p.setCode2(1);
               }
               else{
                  p.setCode2(2);
               }
            }             
         
            else if(p.getCode2()==1){
            p.addMpt(3);
               if(p.getOp()==1){
                  p.setCode2(4);
               }
               else{
                  p.setCode2(5);
               }
            }
            
            else if(p.getCode2() ==2){
            p.addBpt(3);
               if(p.getOp()==1){
                  p.setCode2(3);
               }
               else{
                  p.setCode2(1);
               }
            }
    
            else if(p.getCode2()==3){
                p.setCode2(1);
            }
            else if(p.getCode2()==4){
               p.setCode2(6);
               p.addBpt(6);
            }
            else if(p.getCode2()==5){
               p.setCode2(6);
               p.addBpt(-2);;
            }
            else if(p.getCode2()==6){
               if(p.getOp()==1){
                  p.setCode2(8);
               }
               else{
                  p.setCode2(7);
               }

            }
             else if(p.getCode2()==7){
               p.setCode2(9);
               p.addBpt(3);
               p.addMpt(-5);
            }
             else if(p.getCode2()==8){
               p.setCode2(9);   
               p.addBpt(-1);
               p.addMpt(3);
            }
            else if(p.getCode2()==9){
              if(p.getOp()==1){
                 p.setCode2(10); 
              }
               else{
                  p.setCode2(22);
               }
            }
            else if(p.getCode2()==10){
                  p.setCode2(12);
                   p.addBpt(2);
            }
   
            else if(p.getCode2()==12){
                  p.setCode2(13);
            }
            else if(p.getCode2()==13){
                  p.setCode2(14);
            }
            else if(p.getCode2()==14){
                  p.setCode2(15);
            }
            else if(p.getCode2()==15){
               if(p.getOp()==1){
                  p.setCode2(16);
               }
               else{
                  p.setCode2(17);
               }
            }
            else if(p.getCode2()==16){
             if(p.getOp()==1){
                  p.setCode2(18);
               }
               else{
                  p.setCode2(23);
               }

            }
            else if(p.getCode2()==17){
                  p.setCode1(6);
                  p.setCode2(0);
                  final0(g);
        
            }
            else if(p.getCode2()==18){
               if(p.getOp()==1){
                  p.setCode2(19);
               }
               else{
                  p.setCode2(21);
               }          
            }
            else if(p.getCode2()==19){
               if(p.getOp()==1){
                  p.setCode2(20);
               }
               else{
                  p.setCode2(21);
               }          
            }
             else if(p.getCode2()==20){
                  p.setCode2(21);
            }
            else if(p.getCode2()==21){
                  final0(g);
          
            }
            else if(p.getCode2()==22){
                  final0(g);
            }
             else if(p.getCode2()==23){
                 if(p.getOp()==1){
                  p.setCode2(19);
               }
               else{
                  p.setCode2(21);
               }      
            }

       }
       else if(p.getCode1()==6){
         
            if (p.getCode2()==0){
               if(p.getOp()==1){
                 final1(g);
               }
               else{
                  final7(g);
               }
            }             
         
            else if(p.getCode2()==1){
            p.addBpt(-3);
            p.addMpt(3);
               if(p.getOp()==1){
                  final2(g);       
            }
               else{
                  final8(g);
               }
            }
            
            else if(p.getCode2()==2){
               p.addMpt(-15);
               p.addBpt(15);
               final3(g);
            }
            else if(p.getCode2()==3){
            if(p.getOp()==1){
                  p.addMpt(-3);
               }
               else{
                  p.addBpt(3);
               }

                final12(g);
                
            }
            else if(p.getCode2()==4){
               if(p.getOp()==1){
                 final5(g);
               }
               else{
                 final6(g);
               }

            }
            else if(p.getCode2()==5){
               p.addBpt(10);
               //ending credit slide
               final13(g);
            }
            else if(p.getCode2()==6){
               //ending credit slide
               final14(g);
            }
            else if(p.getCode2()==7){
               p.addMpt(-5);
               if(p.getOp()==1){
                  final2(g);
               }
               else{
                 final8(g);
               }
            }
             else if(p.getCode2()==8){
               p.addMpt(15);
               final9(g);   
            }
            else if(p.getCode2()==9){
            p.addMpt(3);
              if(p.getOp()==1){
                 final10(g); 
              }
               else{
                 final11(g);
               }
            }
            else if(p.getCode2()==10){
               p.addMpt(10);
               //ending credit slide
               final14(g);
            }
            else if(p.getCode2()==11){
               //ending credit slide
                final14(g);
            }
            else if(p.getCode2()==12){
                if(p.getOp()==1){
                 final4(g); 
              }
               else{
                 final13(g);
               }
            }
            else if(p.getCode2()==13){
               //ending credit slide
                  final14(g);
            }
            else if(p.getCode2()==14){
               //ending credit slide
                  final15(g);
            }
      
            }
         
      loopbarb(g);
      }
 
   public static void intro0(GUI g){
      
   
      Branch intro0 = new Branch(1, 0, "go sit on the toilet", "go grab water from the water fountain", "stress.png", "<html>It is another day in Chris' AP Comp Sci class. As you begin to lose hair tracking a<BR> complicated recursion problem, you decide to: </html>");
      g.convert(intro0);  
   
   }
    public static void intro1(GUI g){
   
      Branch intro1 = new Branch(1, 1, "slap your face", "try to clean it with the sewage water", "sewer.png", "<html>Clumsy you, as you leave the classroom, you accidentally fell in this sewer in the middle of the hallway! <BR> After landing in the sewage water, you feel this burning sensation on your face that is spreading down your neck and arms and slowly reaches your little toe. You decide to: </html>");
      g.convert(intro1);  
   
   }
   public static void intro2(GUI g){
   
      Branch intro2 = new Branch(1, 2, "you are excited", "you are super excited", "cafe.png", "<html> It did not help, so you decide to keep walking down the sewer to see if you can find some fresh water to clean your face. <BR> You see the other end of the sewer and climb out. You realize that you have arrived <BR> at the cafe by your dream academy, Barbie Princess Charm School, that turns all their students into princesses of the country!! </HTML>");
      g.convert(intro2);  
   
   }
   
   public static void intro3(GUI g){
   
      Branch intro3 = new Branch(1, 3, "Dame Devin", "Blair", "blairdame.png", "<html> While you walk towards the cafe, you glanced at your reflection on the window. <BR> You realized that your face and body look completely different! You look like Eden from the film, Barbie in a Christmas Carol!! How Crazy!! <BR> You are shocked, but you keep walking towards the cafe. <BR> The outside of it sits Dame Devin, the vice principal of the school, <BR> eating her croissant and Blair, a student at the academy, laughing with her friends. Who do you approach? </HTML>");
      g.convert(intro3);  
      
   
   }
   
   public static void intro4(GUI g){
   
      Branch intro4 = new Branch(1, 4, "happily accept the offer", "decline the offer because you don't want to be evil", "ddoffer.png", "<HTML>You tell Dame Devin that her hair looks nice. She starts laughing uncontrollably. <BR>She stares and ponders at you for a second and decides to reveal something to you. <BR> She tells you that she is actually evil and wants to take over<BR> Gardenia (the country that the school is in), even though she knows that <BR> Blair is the true heir to the throne because she is secretly a princess (but Blair doesn't know)! <BR> She offers you a place at the school under the condition that you must spy on Blair. </HTML>");
      g.convert(intro4);  
   
   }
   
   public static void intro5(GUI g){
   
      Branch intro5 = new Branch(1, 5, "Say goodbye to Dame Devin and get ready for school", "Step on Dame Devin's toes and get ready for school", "goodbye.png", "<html>You declined the offer. But Dame Devin likes your attitude. <BR> She bribes you with $5000 and you now joined the school as her spy. </HTML>");
      g.convert(intro5);  
   
   }
   
 
   public static void intro6(GUI g){
   
      Branch intro6 = new Branch(1, 6, "leave to get a latte", "leave to get iced tea", "friends.png", "<HTML> You walk to Blair and her friends and compliment their new manicure. <BR>You talked about how you got to here from Chris' comp sci class. They are very happy <BR>and wants you to join their school and leave Overlake. <BR>You said you will consider it and walk away to : </HTML>");
      g.convert(intro6);  
   
   }
   
     public static void intro7(GUI g){
   
      Branch intro7 = new Branch(1, 7, "apologize and offer to take her Chanel gown to the drycleaner", "scoff and tell her that her gown is ugly as heck", "angry.png", "<HTML> After you got your drink and walk toward Blair, you bump into Dame Devin who just got up from her seat. <BR> You spilled your drink all over her new Chanel gown. She seems pretty mad. </HTML>"); 
      g.convert(intro7);
   
   }
   
    public static void intro8(GUI g){
   
      Branch intro8 = new Branch(1, 8, "accept the offer", "decline the offer because you don't want to be evil", "imevil.png", "<HTML> She tells you to act careful around her since she has all the power. She stares and ponders at you for a second and decides to reveal something to you. <BR> She tells you that she is actually evil and wants to take over Gardenia (the country that the school is in), even though she knows that <BR> Blair is the true heir to the throne because she is secretly a princess (but Blair doesn't know)! <BR> She offers you a place at the school under the condition that you must spy on Blair. </HTML>");
      g.convert(intro8);  
   
   }
   
   public static void intro9(GUI g){ //declined the offer
   
      Branch intro9 = new Branch(1, 9, "accept the offer", "decline", "damemoney.png", "<HTML> You declined the offer. But Dame Devin likes your attitude. She proceeds <BR> to bribe you with $1000 off on tuition. </HTML>");
      g.convert(intro9);  
   
   }
   
   public static void intro10(GUI g){ //decline
      
      Branch intro10 = new Branch(1, 10, "accept the offer", "decline", "damemoney2.png", "Dame Devin feels challenged. She offers you $2000 to join.");
      g.convert(intro10);  
   
   }
   public static void intro11(GUI g){ //decline
      
      Branch intro11 = new Branch(1, 11, "accept the offer", "decline", "damemoney3.png", "She adds it to $3000.");
      g.convert(intro11);  
   
   }
   public static void intro12(GUI g){ //decline
      
      Branch intro12 = new Branch(1, 12, "accept the offer", "get forced to accept the offer", "damemoney4.png", "She doesn't have that much cash on her. You are forced to take the $3000.");
      g.convert(intro12);  
   
   }
   public static void intro13(GUI g){ //day at school
      
      Branch intro13 = new Branch(1, 13, "yes", "no", "school.png", "It is your first day at the school. You have dance class first, do you want to wake up early to dress up for it?");
      g.convert(intro13);  
   
   }


   public static void nextDay0(GUI g){ //you accepted the offer to cut stuff
      
      
      Branch nextDay0 = new Branch(5, 0, "yes", "no", "scissor.png", "<HTML> Dame Devin's fairies offer you a scissor to cut Blair and her friends' uniform while they are eating.<BR> Do you take the scissor and destroy their uniforms?</HTML>");
      
      g.convert(nextDay0); 
   
   } 
   public static void nextDay1(GUI g){ //if yes to help fairy
   
      Branch nextDay1 = new Branch(5, 1, "yes, of course!", "no, gross.", "uniform.png", "<HTML> Blair and her friends came back very shocked and sad because they have to get ready for the coronation of the queen soon <BR>that requires uniform. They could get expelled if they didn't have their uniform! <BR> Blair the smartie decides to sew the pieces together and make their own uniform! <BR> Do you want to join them? </html>");
      g.convert(nextDay1);
      
   }
   public static void nextDay2(GUI g){ //if no to help fairy
   
      Branch nextDay2 = new Branch(5, 2, "stop them", "stand in the corner and watch", "fairy.png", "<HTML> The fairies kicked your face and said that you are lame. <BR> They proceeded without you. Do you want to stop them?</html>"); 
       g.convert(nextDay2);
      
   }

   public static void nextDay3(GUI g){ //stop them
      
      Branch nextDay3 = new Branch(5, 3, "angry", "amazed", "bufffairy.png", "<html>It was no use, the fairy is too buff and <BR>also used her fire powers on you. You look a little burnt. How are you feeling? </html>");
      g.convert(nextDay3);   
   }

   
   public static void nextDay4(GUI g){ //you join them
      Branch nextDay4 = new Branch(5, 4, "go in a carriage", "call your prince bestie and go on a piggy back ride", "newuniformyeseden.png", "<html> You dressed up with Blair and her friends. You all look gorgeous as heck now. <BR> How do you want to go to school? </html>");
      g.convert(nextDay4);
   }
   
   public static void nextDay5(GUI g){ //you no join them
      Branch nextDay5 = new Branch(5, 5, "go in a carriage", "call your prince bestie and go on a piggy back ride", "newuniformnoeden.png", "<html> You did not join them, they look super good while you are <BR>in your boring uniform. You kind of regret it, <BR>but there is no time. You need to get to the ceremony ASAP. How do you want to go to school? </html>");
      g.convert(nextDay5);   
   }
   public static void nextDay6(GUI g){ //regardless
      Branch nextDay6 = new Branch(5, 6, "Tell Dame Devin that everything is made out of uniform material and they should not get expelled", "Agree with Dame Devin", "dameprincipal.png", "<html>It was a fun ride to school, but you all are two seconds late!<BR> You walked up to Dame Devin and the principal standing next to the door.<BR> Dame Devin stares at the new uniform and tells the principal that this is not <BR> school uniform and everyone should get expelled. What do you do? </html> ");
      g.convert(nextDay6);   
   }
   public static void nextDay7(GUI g){ //agree
      Branch nextDay7 = new Branch(5, 7, "Walk by Blair", "Walk in separately to not get associated with her", "principal.png", "<html>Dame Devin appreciates your support. However, the principal steps in and <BR>thinks that if everything is made out of school uniform, it will be fine, plus, it shows the princesses' character. You all are let in by the prinicipal.</html> ");
      g.convert(nextDay7);   
   }
   public static void nextDay8(GUI g){ //dont agree
      Branch nextDay8 = new Branch(5, 8, "Walk by Blair", "Walk in separately to not get associated with Blair", "deathstare.png", "<html>Dame Devin gives you the death stare. The prinicipal, however, agrees with your point and let you all in to the castle. </html>");
      g.convert(nextDay8);
   }
   public static void nextDay9(GUI g){ //regardless
      Branch nextDay9 = new Branch(5, 9, "Explore the castle with Blair and friends", "stand for 2 hours", "castle.png", "<html> The principal welcomes everyone and allows everyone 2 hours of free time exploring the castle. What do you do? </html>"); 
      g.convert(nextDay9);
   }
   public static void nextDay10(GUI g){ //explore castle
      Branch nextDay10 = new Branch(5, 10, "shocked", "amazed", "portrait.png", "<html> You all walked to an art gallery. There you all see a giant portrait of the queen at the center of the gallery, and they happen to look exactly like Blair! You act: </html>"); 
      g.convert(nextDay10);
   }
   public static void nextDay12(GUI g){ //regardless
      Branch nextDay12 = new Branch(5, 12, "It all adds up...", "Oh no...", "blairstory.png", "<html>Everyone feel exactly how you feel! One of Blair's friends asked about what Blair remembers about her past. She says that she was<BR> adopted by by the wolves on May 2nd of 2000. Her wolf family <BR>found her in a car crash by the castle. How do you react? </html>"); 
      g.convert(nextDay12);
   }
   public static void nextDay13(GUI g){ //regardless
      Branch nextDay13 = new Branch(5, 13, "Join them to spy on Blair's actions", "Join them to help Blair find the crown", "blairknows.png", "<html>Blair's friend says: \"That's got to be it!\", apparently that is the day that the family of the queen got in a car crash. At that time, <BR>the princess (the queen's baby) was only 1 year old. Since Blair looks exactly like the queen,<BR>she has got to be the princess! Now you all must get the magic crown (that will <BR>sparkle when the true heir of the throne has it)to see if Blair is the princess. What do you do? </html>"); 
      g.convert(nextDay13);
   }
   public static void nextDay14(GUI g){ //join them
      Branch nextDay14 = new Branch(5, 14, "Break the basement lock with a chair", "Break the basement lock with your hair pin", "lock.png", "<html>You all snuck out the into the basement of the castle where the crown is stored. Coronation is in three hours and you cannot let Dame Devin take over the country! You all decide to: </html>"); 
      g.convert(nextDay14);
   }
   public static void nextDay15(GUI g){  //regardless
      Branch nextDay15 = new Branch(5, 15, "Knock it down with a stick", "Climb up the shelf and pass it down", "crown.png", "<html>It worked! The door opened and you see the crown. However, it is<BR> up very high and is stored in another locked glass cabinent. What do you guys do? </html>"); 
      g.convert(nextDay15);
   }
    public static void nextDay16(GUI g){ //knock it down
         Branch nextDay16 = new Branch(5, 16, "Try to guess the password to open the door", "Attempt to kick it open with your legs", "doorlocked.png", "<html>Oh no! The glass shattered on the floor and made a huge noise. The alarms went off and a couple seconds later, the basement door was locked behind you! </html>"); 
         g.convert(nextDay16);
   }
   public static void nextDay17(GUI g){ //Climb up the shelf
         Branch nextDay17 = new Branch(5, 17, "Skip to the cornonation", "Sprint to the cornonation", "gotcrown.png", "<html>It worked! You were able to get the crown down and use your hair pin again to open the lock. <BR>That took quite a while, now it is time to go up before the coronation starts. </html>"); 
         g.convert(nextDay17);
   }
   public static void nextDay18(GUI g){ //guess the password
         Branch nextDay18 = new Branch(5, 18, "the day of the coronation", "Blair's birthday", "password.png", "<html>What password could it be? What should you try entering? </html>"); 
         g.convert(nextDay18);
   }
   public static void nextDay19(GUI g){ //day of the coronoation
         Branch nextDay19 = new Branch(5, 19, "your birthday", "Blair's birthday", "password.png", "<html>Ah. Not quite. Try again: </html>"); 
         g.convert(nextDay19);
   }
   public static void nextDay20(GUI g){ //your birthday
         Branch nextDay20 = new Branch(5, 20, "I will try Blair's birthday", "I need to try Blair's birthday", "password.png", "<html>Ah. Not quite. You decide to try the only option you haven't tried yet, Blair's birthday. </html>"); 
         g.convert(nextDay20);
   }
   public static void nextDay21(GUI g){ //blair's birthday
         Branch nextDay21 = new Branch(5, 21, "sprint there", "skip there", "gotcrown.png", "<html>Yes, it is correct!! The door unlocked and you must go fast to the coronation. </html>"); 
         g.convert(nextDay21);
   }
   public static void nextDay22(GUI g){ //stand for 3 hours
         Branch nextDay22 = new Branch(5, 22, "sprint there", "skip there", "runningwithcrown.png", "<html>You stood for 3 hours straight. Kinda hard on the knees. <BR>Then, you see Blair and her friends running up from the basement <BR>entrance across the room. She must have found out that she is the true heir <BR>to the throne! You see that they are running to the coronation. You should get going too.</html>"); 
         g.convert(nextDay22);
   }
    public static void nextDay23(GUI g){ //kick the door
         Branch nextDay23 = new Branch(5, 23, "the day of the coronation", "Blair's birthday", "password.png", "<html>You have weak legs. It did not work. <BR>You decided to try some passwords. What do you want to enter? </html> "); 
         g.convert(nextDay23);
   }
   public static void final0(GUI g){
         Branch final0 = new Branch(6, 0, "Trip Blair so that the crown falls from her hand", "Ignore Dame Devin", "ddspeech.png", "<html>You all run into the coronation while Dame Devin is giving her speech, saying that she can't wait <BR>to become the new ruler of the nation & the Barbie Charm School. Dame Devin glances over her shoulder and sees Blair with <BR>the crown. She gives you the look, signaling you to take her down. What do you do? </html>");
         g.convert(final0);
   }
   public static void final1(GUI g){//trip blair
         Branch final1 = new Branch(6, 1, "Put it on Blair's head", "Give it to Dame Devin", "runningwithcrown.png", "<html> Blair falls to the ground. The crown flys out her hand and lands on the floor. You take the crown in your hands. <BR>Just now, Dame Devin announces to everyone that you have brought the crown for her coronation. Everyone in the ceremony looks at you, what do you do with the crown?</html>"); 
         g.convert(final1);
   }
   public static void final2(GUI g){//put it on blair's head
         Branch final2 = new Branch(6, 2, "Hug her back", "Kiss her cheeks", "princess.png", "<html> You place the crown on Blair's head, and magic happens!! The crown starts sparkling and Blair's uniform transformed <BR>into a diamond gown. She really is the princess, and she couldn't have done it without you.<BR> Blair is very emotional and hugs you. She tells you that you are her best friend. </html>"); 
         g.convert(final2);
   }
   public static void final3(GUI g){//regardless
         Branch final3 = new Branch(6, 3, "Heck you Dame Devin", "I love you blair", "ddmad.png", "<html>Dame Devin is real mad. Now everyone knows that she was lying about the death of the princess. <BR>She rage walks to you and lifts her arm up, she is going to slap you. Just before her hand reaches you, Blair pushes her away,<BR> saving you from pain. The guards took her away. You say: </html>"); 
         g.convert(final3);
   }
  
   public static void final4(GUI g){//regardless 
         Branch final4 = new Branch(6, 4, "You <3 Blair", "You <3 Nicolas", "choice.png", "<html>Yay! She offers you the following marriage: </html>"); 
         g.convert(final4);
   }
    public static void final5(GUI g){//Blair
         Branch final5 = new Branch(6, 5, "Awesome!", "Meh", "final.png", "<html>Congrats! You are now married to Blair! What a cute couple! Congrats on crowning Blair and giving this nation a great ruler. You are incredible. Please rate your adventure: </html>"); 
         g.convert(final5);
   }
   public static void final6(GUI g){//Nicolas
         Branch final6 = new Branch(6, 6, "Awesome!", "Meh", "final.png", "<html>Congrats! You are now married to Nicolas! What a cute couple! Congrats on crowning Blair and giving this nation a great ruler. You are incredible. Please rate your adventure: </html>"); 
         g.convert(final6);
   }
   public static void final7(GUI g){//ignore dame devin
         Branch final7 = new Branch(6, 7, "Put it on Blair's head", "Give it to Dame Devin", "runningwithcrown.png", "<html>You ignore Dame Devin and watched Blair walk towards the stage, however, she accidentally tripped on the carpet and fell to the ground. <BR>The crown flys out her hand and lands on the floor. You take the crown in your hands. Just now,<BR> Dame Devin announces to everyone that you have brought the crown for her coronation.<BR> Everyone in the ceremony looks towards you, what do you do with the crown? </html>"); 
         g.convert(final7);
   }
   public static void final8(GUI g){//give it to Dame Devin
            Branch final8 = new Branch(6, 8, "Hug back", "Pat her on the back", "ddcrown.png", "<html>You hand the crown to Dame Devin. She smiles at you and puts the crown on her own head. <BR>However, the crown did not sparkle like it would on the true princess' head. But it doesn't matter, you want Dame Devin to<BR> be the queen, and you completed the job she gave you. Dame Devin walks towards you and wants to hug you. </html>"); 
         g.convert(final8);
   }
   public static void final9(GUI g){//regardless
         Branch final9 = new Branch(6, 9, "Accept", "Decline", "adoption.png", "<html>Dame Devin is very happy. To thank you service, she offers to adopt you. </html>"); 
         g.convert(final9);
   }
    public static void final10(GUI g){//accept
         Branch final10 = new Branch(6, 10, "Awesome!", "Meh", "final.png", "<html>Congratulations! You now have a mother and successfully completed your adventure! Please rate your experience: </html>"); 
         g.convert(final10);
   }
    public static void final11(GUI g){//decline
         Branch final11 = new Branch(6, 11, "Awesome!", "Meh", "final.png", "<html>That's alright. Dame Devin still appreciates you and paid the rest of your tuition. Congrats on successfully completing your adventure! Please rate your experience: </html>"); 
         g.convert(final11);
   }
    public static void final12(GUI g){//regardless 
         Branch final12 = new Branch(6, 12, "YES!", "I'll pass", "offer.png", "<html>Blair tells you how awesome you are. To thank your service, she offers you the option to marry her or Nicolas. Do you accept? </html>"); 
         g.convert(final12);
   }
    public static void final13(GUI g){//no marriage 
         Branch final13 = new Branch(6, 13, "Awesome!", "Meh", "final.png", "<html>That's alright. You don't need anyone because you are awesome just on your own. Congrats on sucessfully completing your adventure! Please rate your experience  </html>"); 
         g.convert(final13);
   }
   public static void final14(GUI g){//final branch 
         Branch final14 = new Branch(6, 14, "Hope you had fun!", "Next>>", "us.png", "<html>Thank you for playing! This branch was made by Sonja Larson & Catherine Liu. </html>"); 
         g.convert(final14);
   }
   public static void final15(GUI g){//final 
         Branch final15 = new Branch(6, 15, ":D", "goodbye now", "nothing.png", "<html>This Choose Your Own Adventure Game is made by Sonja Larson, Catherine Liu, & Chloe Kim.</html>"); 
         g.convert(final15);
   }



}
