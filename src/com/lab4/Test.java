package com.lab4;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(7.5);
        c1.setRadius(7.5);
        String formatter; // to limit decimal places

        formatter = String.format("%.2f", c1.getRadius());
        System.out.println("The radius of circle 1 is: "+formatter);

        formatter = String.format("%.2f", c1.calculateArea());
        System.out.println("The area of circle 1 is: "+formatter);

        formatter = String.format("%.2f", c1.calculateCircumference());
        System.out.println("The circumference of circle 1 is: "+formatter);


    }
}
