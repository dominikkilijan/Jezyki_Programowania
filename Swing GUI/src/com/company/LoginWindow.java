package com.company;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame {


    JButton loginButton = new JButton("Login");
    JButton cancelButton = new JButton("Cancel");
    JPanel backgroundPanel = new JPanel();
    JLabel userLabel = new JLabel("User");
    JLabel passwordLabel = new JLabel("Password");

    JTextField loginField = new JFormattedTextField();
    JPasswordField passwordField = new JPasswordField();


    LoginWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);
        this.add(backgroundPanel);

        backgroundPanel.setBackground(Color.white);
        backgroundPanel.setLayout(null);


        backgroundPanel.add(userLabel);
        backgroundPanel.add(loginField);
        userLabel.setBounds(10,20,80,25);
        loginField.setBounds(100,20,165,25);


        backgroundPanel.add(passwordLabel);
        backgroundPanel.add(passwordField);
        passwordLabel.setBounds(10,55,80,25);
        passwordField.setBounds(100,55,165,25);

        backgroundPanel.add(loginButton);
        backgroundPanel.add(cancelButton);
        loginButton.setBounds(50,110,80,25);
        cancelButton.setBounds(150, 110,80,25);


        this.setVisible(true);
    }

    /*void changeBackgroundColor() {
        if () {
            panel.setBackground(Color.GREEN);
        }
    }*/
}
