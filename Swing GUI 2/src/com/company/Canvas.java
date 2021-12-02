package com.company;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    Shape shapeDrawing = new Shape();

    Canvas(){
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.lightGray);
//        this.shapeDrawing.setXPosition(shape.getXPosition());
//        this.shapeDrawing.setYPosition(shape.getYPosition());
//        this.shapeDrawing.setShape(shape.getShape());

    }

    @Override
    protected void paintComponent(Graphics g1) {
        super.paintComponent(g1);
        Graphics2D g = (Graphics2D) g1.create();
        g.setColor(Color.black);
        shapeDrawing.draw(g);
    }
}
