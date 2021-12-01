package com.company;

import javax.swing.*;

public class Window extends JFrame {
    JFrame frame = new JFrame();
    JButton runButton = new JButton("Run");
    JButton cancelButton = new JButton("Cancel");

    Window() {
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);


        frame.add(runButton);
        runButton.setBounds(20,400,80,25);
        frame.add(cancelButton);
        cancelButton.setBounds(350,400,80,25);

        frame.setVisible(true);
    }
}
