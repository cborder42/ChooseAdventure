import java.util.*;
import java.awt.*;
import javax.swing.*;

public class PutImage{

   //method call to display image, takes the JFrame of graphics, the file location of the image, a JLabel object, as well as a Dimension as parameters
   //so to use this method simply call PutImage.displayImage(frame, imagelocation, label, dimension)
   
   // the imageicon is set to be on the label passed as a parameter, so the label must be added to the frame in another class/method
   //the dimension is used to set the size of the image to 1/2 of the screen
   // so, rather than adding the image to the Jframe like before, this now updates the label to contain the image
   
   //example: PutImage.displayImage(fram, "cod.PNG", lab);
   
   
   public static void displayImage(JFrame frams, String place, JLabel label, Dimension d){
      
      ImageIcon img = new ImageIcon(new ImageIcon(place).getImage().getScaledInstance(d.width,d.height/2, Image.SCALE_DEFAULT));
      TimeFrame fram = new TimeFrame(frams, img, label);
   
   }   
   
   //class to display the graphics
   public static class TimeFrame extends JFrame{
   
      
      private JFrame f;
      public TimeFrame(JFrame fra, ImageIcon img, JLabel label){
      
         f = fra;
         label.setIcon(img);
         
         f.setVisible(true);
      
      }
    
   }

   
}
