package com.company;

import java.awt.*;

public class Shape {
    Integer xPosition;
    Integer yPosition;
    char shape;

    Shape() {
        shape = 'o';
    }

    public Integer getxPosition() {
        return xPosition;
    }

    public void setxPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getyPosition() {
        return yPosition;
    }

    public void setyPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.black);
        switch (shape) {

            case 'o' -> g.fillOval(this.xPosition,this.yPosition,20,30);
            case 'r' -> g.fillRect(this.xPosition,this.yPosition,20,30);
        }
    }
}
