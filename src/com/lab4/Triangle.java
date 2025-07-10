package com.lab4;

public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        super(0,0); // center of shape?
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateCircumference() {
        return 0;
    }
}
