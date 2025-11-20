package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton, backButton;


    Login(){

        //JLabel is used when we want to make visible some text over the frame
        JLabel userName = new JLabel("Username:");
        userName.setBounds(40,20,100,30);
        add(userName);

        usernameField = new JTextField();
        usernameField.setBounds(150,20,150,30);
        add(usernameField);

        JLabel password = new JLabel("Password:");
        password.setBounds(40,70,100,30);
        add(password);

        passwordField = new JPasswordField();
        passwordField.setBounds(150,70,150,30);
        add(passwordField);

        loginButton = new JButton("LOGIN");
        loginButton.setBounds(150,140,150,30);
        loginButton.setBackground(Color.black);
        loginButton.setForeground(Color.white);
        add(loginButton);

        backButton = new JButton("BACK");
        backButton.setBounds(150,180,150,30);
        backButton.setBackground(Color.black);
        backButton.setForeground(Color.white);
        add(backButton);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/LoginB.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,600,300);
        add(img);

//        ImageIcon i1 = new ImageIcon("icons/LoginB.jpg");
//        Image i2 = i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel img = new JLabel(i3);
//        img.setBounds(0,0,600,300);
//        add(img);


        setSize(600,300);
        setLocation(50,0);
        setLayout(null); //by default it is border layout so we set it to null
        setVisible(true);
    }
    public static void main(String args[]){
        new Login(); //object of class, this will invoke the constructor
    }
}
