package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JFrame {
    JFrame frame = new JFrame();
    JButton runButton = new JButton("Run");
    JButton cancelButton = new JButton("Cancel");
    JPanel buttonPanel = new JPanel();

    Window() {
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);


        frame.add(runButton);
        runButton.setBounds(20,400,80,25);
        runButton.add(buttonPanel);
        buttonPanel.setBackground(Color.GRAY);
        buttonPanel.setLayout(new GridLayout());
        buttonPanel.setSize(60,25);
        buttonPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                int i;

                runButton.setLocation(frame.getMousePosition());
            }
        });
        frame.add(cancelButton);
        cancelButton.setBounds(350,400,80,25);
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                runButton.setLocation(20,400);
            }
        });

        frame.setVisible(true);
    }
}
