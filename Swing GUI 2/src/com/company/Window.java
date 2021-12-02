package com.company;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JFrame {
    JFrame frame = new JFrame();
    JButton runButton = new JButton("Run");
    JButton cancelButton = new JButton("Cancel");
    JPanel buttonPanel = new JPanel();
    Integer i=0;
    Canvas canvas = new Canvas();

    Window() {
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.add(canvas);
        canvas.setFocusable(true);
        canvas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                canvas.shapeDrawing.setShape(e.getKeyChar());
            }
        });
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                canvas.shapeDrawing.setXPosition((int) canvas.getMousePosition().getX());
                canvas.shapeDrawing.setYPosition((int) canvas.getMousePosition().getY());
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
