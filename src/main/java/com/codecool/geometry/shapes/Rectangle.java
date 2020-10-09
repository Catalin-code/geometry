package com.codecool.geometry.shapes;

public class Rectangle extends Shape {

    private double l1;

    private double l2;

    public Rectangle(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public double calculateArea() {

        return l1 * l2;
    }

    @Override
    public double calculatePerimeter() {

        return l1 * 2 + l2 * 2;
    }
}
