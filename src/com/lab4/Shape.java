package com.lab4;

public abstract class Shape {
    private int x, y; // coordinates of a shape

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea();
    public abstract double calculateCircumference(); // can also calculate perimeter

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
