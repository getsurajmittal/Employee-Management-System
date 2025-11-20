package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    //constructor
    Splash(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.png"));
        Image i2 = i1.getImage().getScaledInstance(1170,650, Image.SCALE_DEFAULT); //create scaled image
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); //put scaled image on frame
        image.setBounds(0,0,1170,650);
        add(image); //put image on frame

        setSize(1170,650);
        setLocation(50,0); //center the frame on the computer screen
        setLayout(null);
        setVisible(true); //make the frame visible in the class

        try{
            Thread.sleep(5000);
            setVisible(false); //close splash frame after 5 seconds
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String args[]){
        new Splash(); //creating new object

    }
}
