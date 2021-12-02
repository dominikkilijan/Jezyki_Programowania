package com.company;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    Shape shapeDrawing = new Shape();

    Canvas(){
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.lightGray);

    }

    @Override
    protected void paintComponent(Graphics g1) {
        super.paintComponent(g1);
        Graphics2D g = (Graphics2D) g1.create();
        shapeDrawing.draw(g);
    }
}
