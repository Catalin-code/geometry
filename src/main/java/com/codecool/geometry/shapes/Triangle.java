package com.codecool.geometry.shapes;

import com.codecool.geometry.Main;

public class Triangle extends Shape {

    private double l1;
    private double l2;
    private double l3;

    public Triangle(double l1, double l2, double l3){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }

    @Override
    public double calculatePerimeter() {

        return l1 + l2 + l3;
    }
}
