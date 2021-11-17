package com.company;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton cancelButton = new JButton("Cancel");
    JPanel backgroundPanel = new JPanel();
    JLabel user = new JLabel("User");
    JLabel password = new JLabel("Password");

    JTextField loginField = new JFormattedTextField();
    JPasswordField passwordField = new JPasswordField();


    LoginWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,400);
        this.add(backgroundPanel);

        //backgroundPanel.setLayout(new FlowLayout());
        backgroundPanel.setBackground(Color.lightGray);

        backgroundPanel.add(user);
        backgroundPanel.add(loginField);
        loginField.setPreferredSize(new Dimension(100,25));

        backgroundPanel.add(password);
        backgroundPanel.add(passwordField);
        passwordField.setPreferredSize(new Dimension(100,25));

        backgroundPanel.add(loginButton);
        backgroundPanel.add(cancelButton);

        this.pack();
        this.setVisible(true);
    }

    /*void changeBackgroundColor() {
        if () {
            panel.setBackground(Color.GREEN);
        }
    }*/
}
