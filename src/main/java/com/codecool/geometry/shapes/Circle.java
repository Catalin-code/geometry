package com.codecool.geometry.shapes;

public class Circle extends Shape {

    private double r;

    public  Circle(double r){
        this.r = r;
    }

    @Override
    public double calculateArea() {

        return Math.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {

        return 2 * Math.PI * r;
    }
}
