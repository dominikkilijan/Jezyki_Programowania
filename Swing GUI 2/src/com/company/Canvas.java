package com.company;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
//    Integer xPosition;
//    Integer yPosition;
//    char shape;
    JPanel canvas = new JPanel();
    Shape shapeDrawing = new Shape();

//    public Integer getxPosition() {
//        return xPosition;
//    }
//
//    public void setxPosition(Integer xPosition) {
//        this.xPosition = xPosition;
//    }
//
//    public Integer getyPosition() {
//        return yPosition;
//    }
//
//    public void setyPosition(Integer yPosition) {
//        this.yPosition = yPosition;
//    }

    Canvas(Integer xPosition,Integer yPosition, char shape) {
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.lightGray);
        shapeDrawing.setxPosition(xPosition);
        shapeDrawing.setyPosition(yPosition);
    }
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
