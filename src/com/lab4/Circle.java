package com.lab4;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super(0,0); // center of shape?
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculateCircumference() {
        return 2*Math.PI*radius;
    }
}
