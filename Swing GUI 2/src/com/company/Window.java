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
    Integer i=0;
    Canvas canvas = new Canvas(100,100,'o');

    Window() {
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.add(canvas);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                canvas.repaint();
            }
        });
        canvas.setLayout(null);
        canvas.add(runButton);
        runButton.setBounds(20,400,80,25);
        runButton.setFocusable(false);
        runButton.add(buttonPanel);
        buttonPanel.setOpaque(false);
        runButton.setLayout(null);
        buttonPanel.setBounds(0,0,70,25);
        buttonPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                i++;
                switch (i % 4) {
                    case 0 -> runButton.setLocation(20, 20);
                    case 1 -> runButton.setLocation(400, 20);
                    case 2 -> runButton.setLocation(400, 300);
                    case 3 -> runButton.setLocation(20, 300);
                }
                System.out.println((frame.getMousePosition()));
                System.out.println((frame.getMousePosition().getX()));
                System.out.println((frame.getMousePosition().getY()));
            }
        });
        runButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("*Click!*");
            }
        });
        canvas.add(cancelButton);
        cancelButton.setFocusable(false);
        cancelButton.setBounds(350,400,80,25);
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                runButton.setLocation(20,400);
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
