package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class LoginWindow extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton cancelButton = new JButton("Cancel");
    JPanel backgroundPanel = new JPanel();
    JLabel userLabel = new JLabel("User");
    JLabel passwordLabel = new JLabel("Password");

    JTextField loginField = new JFormattedTextField();
    JTextField passwordField = new JTextField();



    LoginWindow() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.add(backgroundPanel);

        backgroundPanel.setBackground(Color.white);
        backgroundPanel.setLayout(null);


        backgroundPanel.add(userLabel);
        backgroundPanel.add(loginField);
        userLabel.setBounds(10, 20, 80, 25);
        loginField.setBounds(100, 20, 165, 25);


        backgroundPanel.add(passwordLabel);
        backgroundPanel.add(passwordField);
        passwordLabel.setBounds(10, 55, 80, 25);
        passwordField.setBounds(100, 55, 165, 25);

        backgroundPanel.add(loginButton);
        backgroundPanel.add(cancelButton);
        loginButton.setBounds(50, 110, 80, 25);
        loginButton.addActionListener(this);
        cancelButton.setBounds(150, 110, 80, 25);
        cancelButton.addActionListener(this);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(cancelButton)) {
            System.exit(0);
        } else if (actionEvent.getSource().equals(loginButton)) {
            String userlog = loginField.getText();
            String userpass = passwordField.getText();
            System.out.println(userlog + " " + userpass);
            changeBackgroundColor(userlog, userpass);
        }
    }

    void changeBackgroundColor(String userlogin, String userpassword) {
        HardcodedMap hardcodedMap = new HardcodedMap();
        if (hardcodedMap.map.containsKey(userlogin) && hardcodedMap.map.containsValue(userpassword)) {
            System.out.println("Dziala");
            backgroundPanel.setBackground(Color.GREEN);
        }
        else backgroundPanel.setBackground(Color.RED);
    }

}