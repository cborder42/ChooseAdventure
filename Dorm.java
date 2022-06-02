import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Dorm{


   public static void loopDorm(GUI g){
      Player p = g.getPlayer();
      int code = p.getCode2();
      if(p.getCode1()==4){
         if (code==0){
            dorm0(g);
         
         }
         if (code==1){
            dorm1(g);
         
         }
         else if (code==2){
            dorm2(g);
         }
         else if (code==3){
         
            dorm3(g);
         }
         else if (code==4){
            dorm4(g);
         }
         else if(code==5){
            dorm5(g);
         }
         else if (code==6){
            dorm6(g);
         }
         else if (code==7){
            dorm7(g);
         }
         else if (code==8){
            dorm8(g);
         }
         else if (code==9){
            dorm9(g);
         }
         else if (code==10){
            dorm10(g);
         
         }
         else if (code==11){
            dorm11(g);
         
         }
         else if (code==12){
            dorm12(g);
         
         }
         else if (code==13){
            dorm13(g);
         
         }
         else if (code==14){
            dorm14(g);
         
         }
          else if (code==15){
            dorm15(g);
         
         }
         else if (code==16){
            dorm16(g);
         
         }
         else if (code==17){
            dorm17(g);
         
         }
         else if (code==18){
            dorm18(g);
         
         }
         else if (code==19){
            dorm19(g);
         
         }

      }
         
   }
  
      
  
   public static void findNextDorm(GUI g){
      Player p = g.getPlayer();
      int c = p.getCode2();
      int op = p.getOp();
          
       g.getPlayer().setLCode1(g.getPlayer().getCode1());
       g.getPlayer().setLCode2(g.getPlayer().getCode2());
       if(c==0){
            if(op==1){
               p.addBpt(3);
                        
            }
            else{
               p.addBpt(-3);
            
            }
            p.setCode2(1);
         }
         
         
         else if (c==1){
            p.setCode2(2);         
         }
                  
         else if(c==2){
            if(op==1){
               p.setCode2(3);
            
            }
            else{
               p.setCode2(4);
            }
   
         
         }
         else if((c ==3)||(c==4)){
            if(op==1){
               p.addBpt(2);
            
            }
            p.setCode2(5);         
         }
         
         else if (c==5){
            if(op==1){
               p.setCode2(6);
            
            }
            else{
               p.setCode2(7);
                          
            }
         
         
         }
         
         
         else if((c==6)||(c==7)){
            
            p.setCode2(8);            
            
                   
         }
         else if(c==8){
            if(op==2){
            
               p.addMpt(1);
               p.addBpt(-1);
            }   
            
            if(p.getNecklace()){
               p.setCode2(10);
            
            }  
            else{
               p.setCode2(9);
            
            }    
         }
         
         else if(c==9){
          if(op==1){
               p.addBpt(1);
           }
           p.setCode2(12);
         
         }
         else if(c==10){
            
            p.setCode2(11);
            
         
         }
         else if((c==11)||(c==12)){
            if(op==1){
               p.setCode2(13);
            }
            else{
               p.setCode2(15);
            }
         }
         else if(c==13){
            if(op==1){
               p.addBpt(1);
            }
            
             p.setCode2(14);
            
         
         }
         
         else if(c==14||c==15){
         
            if(p.getNecklace()){
               p.setCode2(16);
            
            }
            else{
               p.setCode2(17);
            
            }
            
                     
         }
         else if(c==17||c==16){
         
            p.setCode2(18);
         }
         
         else if(c==18){
            p.setCode2(19);
         
         }
         else if(c==19){
            
            BarbieSchoolInfo.nextDay0(g);
         }
                  
         loopDorm(g);
         
         
         
         
         
        
         
         
      
      
      
      
   }
   
         
      
      
      
      
   
     
   public static void dorm0(GUI g){
   
      Branch dorm0 = new Branch(4,0, "This is so exciting!", "Okay, well clearly I didn't get to choose...", "dorm0.PNG", "As you arrive at your dorm, you see Blair there too. She says \"Oh cool it looks like we're together!\". How do you respond?");
      g.convert(dorm0);
   
   }
 
   public static void dorm1(GUI g){
   
      Branch dorm1 = new Branch(4, 1, "Stay up watching cat videos", "Quickly fall into a peaceful sleep", "dorm1.PNG", "After talking with Blair for a few minutes, you finish getting settled in and head off to sleep. Do you stay up late or go to sleep early?");
      g.convert(dorm1);  
   
   }
   
   public static void dorm2(GUI g){
   
      Branch dorm2 = new Branch(4, 2, "Follow Blair out of the room", "stay and hide the necklace that Dame Devin gave you", "dorm2.PNG", "The next day you wake up and get ready to go to school. When you grab your backback you hear the fire alarm ringing. Your dormmates start rushing out of the room. What do you do?");
      
      g.convert(dorm2);  
   
   }
   
   public static void dorm3(GUI g){
   
      Branch dorm3 = new Branch(4, 3, "Chat with Blair", "Silently stare at the sky", "dorm3.PNG", "You safely exit the builiding and regroup at the designated fire drill area which your roommates led you to, discreetly putting the necklace in a bush on the way. While waiting for the 'fire' to be cleared, what do you do?");
      g.getPlayer().addBpt(3);
      g.convert(dorm3);  
      
   
   }
   
   public static void dorm4(GUI g){
   
      Branch dorm4 = new Branch(4, 4, "Find and chat with Blair", "hide in the corner and silently stare at the sky", "dorm4.PNG", "Once all your roommates have left the room, you begin to look through Blair's things before finding an ideal spot and hiding the necklace. You then make your way to the fire drill area. Once there, what do you do?");
      g.getPlayer().addMpt(3);
      g.getPlayer().setNecklace(true);
      g.convert(dorm4);  
   
   }
   
   public static void dorm5(GUI g){
   
      Branch dorm5 = new Branch(4, 5, "pet the puppy", "ignore the puppy", "dorm5.PNG", "After the fire is called to be a false-alarm you head back to your dorm. On your way to the dorm you see a puppy, what do you do?");
      
      g.convert(dorm5);  
   
   }
   
   public static void dorm6(GUI g){
   
      Branch dorm6 = new Branch(4, 6, "yes :)", "no :(", "dorm6.PNG", "The puppy is happy. Are you happy now?");
      
      g.convert(dorm6);  
      
   
   }
   
   public static void dorm7(GUI g){
      Branch dorm7 = new Branch(4,7, "yes >:)", "no :(", "dorm7.PNG", "The puppy is sad. Are you happy now?");
    
      g.convert(dorm7);
   
   }
   
   public static void dorm8(GUI g){
      Branch dorm8 = new Branch(4,8, "scoff", "nod vigorously", "dorm8.PNG", "As you approach the dorm, you see Dame Devin in the room with some other school officials. She exclaims to everyone how she can't find her precious necklace, and that Blair MUST have stolen it. How do you react?");
   
      g.convert(dorm8);
   
   
   }
   
   public static void dorm9(GUI g){
      Branch dorm9 = new Branch(4,9, "cower in fear in the corner", "stand unaffected", "dorm9.PNG", "As Dame Devin tries to reveal the necklace in Blair's things, she cannot find it. She chokes out a forced apology to Blair before leaving the room, glaring at you. What do you do?");
      g.getPlayer().addMpt(-10);
      g.convert(dorm9);
   
   
   }
   
   
   public static void dorm10(GUI g){
      Branch dorm10 = new Branch(4,10, "comfort Blair", "stand, acting shocked", "dorm10.PNG", "Dame Devin glances through Blair's things, quickly finding the necklace. Dame Devin then yells at the other school officials, demanding that Blair is punished. What do you do?");
      g.getPlayer().addMpt(10);
      g.convert(dorm10);
   
   }
   
   public static void dorm11(GUI g){
      Branch dorm11 = new Branch(4,11, "go to the park with Blair", "refuse Blair and go to your meeting with Dame Devin", "dorm11.PNG", "<html>Blair then has to go talk to the school officials, and is eventaully let off with a warning. Soon after, she returns to the dorm where she invites you to go to the park with her.<BR> You are supposed to go to your meeting with Dame Devin. What do you do?</html>");
      g.convert(dorm11);
   
   }
   
   public static void dorm12(GUI g){
      Branch dorm12 = new Branch(4,12, "go to the park with Blair", "refuse Blair and go to your meeting with Dame Devin ", "dorm12.PNG", "Later on, Blair invites you to go to the park with her. You are supposed to go to your meeting with Dame Devin. What do you do?");
      g.convert(dorm12);
   
   }
   

   
   public static void dorm13(GUI g){
      Branch dorm13 = new Branch(4,13, "comfort her", "tell her she's overreacting", "dorm13.PNG", "You head to the park with Blair where Blair begins to open up about how stressful this past experience was for her. What do you do?");
      g.getPlayer().addMpt(-5);
      g.convert(dorm13);
   
   }
   
   public static void dorm14(GUI g){
      Branch dorm14 = new Branch(4,14, "scream", "cry", "dorm14.PNG", "After spending some more time with Blair in the park, you decide to head back to your dorm. Just as you get out of Blair's view you are pulled into an alleyway. What do you do?");
      
      g.convert(dorm14);
   
   }
   
   public static void dorm15(GUI g){
      Branch dorm15 = new Branch(4,15, "greet Dame Devin", "stand silently", "dorm15.PNG", "Eventually you make it to your meeting place with Dame Devin, a nearby alleyway. What do you do?");
      
      g.convert(dorm15);
   
   }
   
   public static void dorm16(GUI g){
      Branch dorm16 = new Branch(4,16, "gratefully accept the sweater", "throw the sweater on the ground", "dorm16.PNG", "Dame Devin tells you that she is very happy with how her last plan went, and wants to give you a reward for it. She gifts you a fancy sweater. How do you react?");
      
      g.convert(dorm16);
   
   }
   public static void dorm17(GUI g){
      Branch dorm17 = new Branch(4,17, "scoff", "nod in acceptance", "dorm17.PNG", "Dame Devin tells you that she is very disappointed that you did not hide the necklace in Blair's things. Despite this, she says she will give you another chance. How do you react?");
    
      g.convert(dorm17);
   
   }
   public static void dorm18(GUI g){
      Branch dorm18 = new Branch(4,18, "excited", "horrified", "dorm18.PNG", "Dame Devin lets you in on her next plan. You and a fairy will rip up Blair's uniform. Since she has to wear the uniform to go to her classes, she won't be able to go or graduate without it. How do you feel?");
   
      g.convert(dorm18);
   
   }
  
   public static void dorm19(GUI g){
      Branch dorm19 = new Branch(4,19, "gasp", "gasp loudly", "dorm19.PNG", "You then head back to your dorm where you quickly fall asleep. You then wake up a bit late, and your roommates leave to eat before you do. While they are gone, a fairy shows up. What do you do?");
      g.convert(dorm19);
   }
     
   




}
