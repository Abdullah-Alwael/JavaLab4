package com.lab4;

public class Test {
    public static void main(String[] args) {
        // Circle
        Circle c1 = new Circle(7.5);
        String formatter; // to limit decimal places

        formatter = String.format("%.2f", c1.getRadius());
        System.out.println("Initial circle 1 radius was: "+formatter);

        c1.setRadius(8.5);
        formatter = String.format("%.2f", c1.getRadius());
        System.out.println("The radius of circle 1 is now: "+formatter);

        formatter = String.format("%.2f", c1.calculateArea());
        System.out.println("The area of circle 1 is: "+formatter);

        formatter = String.format("%.2f", c1.calculateCircumference());
        System.out.println("The circumference of circle 1 is: "+formatter);

        // Rectangle
        Rectangle r1 = new Rectangle(10,5);
        formatter = String.format("%.2f", r1.getHeight());
        System.out.println("Initial rectangle 1 height is: "+formatter);

        r1.setHeight(11);
        formatter = String.format("%.2f", r1.getHeight());
        System.out.println("Rectangle 1 height is now: "+formatter);

        formatter = String.format("%.2f", r1.getWidth());
        System.out.println("Initial rectangle 1 width is: "+formatter);

        r1.setWidth(6);
        formatter = String.format("%.2f", r1.getWidth());
        System.out.println("Rectangle 1 width is now: "+formatter);


        formatter = String.format("%.2f", r1.calculateArea());
        System.out.println("The area of rectangle 1 is: "+formatter);

        formatter = String.format("%.2f", r1.calculateCircumference()); // Perimeter
        System.out.println("The Perimeter of rectangle 1 is: "+formatter);

        // Triangle

    }
}
