package com.company;

import java.awt.*;

public class Shape {
    Integer xPosition;
    Integer yPosition;
    char shape;

    public Integer getXPosition() {
        return xPosition;
    }

    public void setXPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getYPosition() {
        return yPosition;
    }

    public void setYPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }
    public char getShape() {
        return shape;
    }

    public void setShape(char shape) {
        this.shape = shape;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.black);
        switch (shape) {
            case 'o' -> g.fillOval(this.xPosition,this.yPosition,20,30);
            case 'r' -> g.fillRect(this.xPosition,this.yPosition,20,30);
            case 'c' -> g.fillOval(this.xPosition,this.yPosition,30,30);
            case 's' -> g.fillRect(this.xPosition,this.yPosition,30,30);
        }
    }
}
