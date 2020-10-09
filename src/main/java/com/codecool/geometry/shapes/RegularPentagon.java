package com.codecool.geometry.shapes;

public class RegularPentagon extends Shape {

    private double l1;

    public RegularPentagon(double l1){
        this.l1 = l1;
    }

    @Override
    public double calculateArea() {

        return (Math.sqrt(25 + 10 * Math.sqrt(5))) / 4 * Math.pow(l1, 2);
    }

    @Override
    public double calculatePerimeter() {

        return l1 * 5;
    }
}
