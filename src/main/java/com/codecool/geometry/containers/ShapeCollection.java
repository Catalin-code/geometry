package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Shape;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;

import java.util.*;

public class ShapeCollection {
    HashMap<String, List<Double>> shapeList = new HashMap<>();
    List<Double> values;

    Scanner userInput = new Scanner(System.in);
    Scanner userInputObjName = new Scanner(System.in);

    public void addShape(int option) {
        if (option == 1) {
            System.out.print("Enter your circle's name: ");
            String objName = userInputObjName.next();
            System.out.print("Enter circle's radius: ");
            double r = userInput.nextDouble();
            System.out.println();
            Shape circle = new Circle(r);
            values = new ArrayList<>();
            values.add(circle.calculatePerimeter());
            values.add(circle.calculateArea());
            shapeList.put(objName, values);
        } else if (option == 2) {
            System.out.print("Enter your rectangle's name: ");
            String objName = userInputObjName.next();
            System.out.print("Enter rectangle's width: ");
            double w = userInput.nextDouble();
            System.out.print("Enter rectangle's height: ");
            double h = userInput.nextDouble();
            System.out.println();
            Rectangle rectangle = new Rectangle(w, h);
            values = new ArrayList<>();
            values.add(rectangle.calculatePerimeter());
            values.add(rectangle.calculateArea());
            shapeList.put(objName, values);
        } else if (option == 3) {
            System.out.print("Enter your triangle's name: ");
            String objName = userInputObjName.next();
            System.out.print("Enter triangle's left side: ");
            double a = userInput.nextDouble();
            System.out.print("Enter rectangle's base: ");
            double b = userInput.nextDouble();
            System.out.print("Enter rectangle's right side: ");
            double c = userInput.nextDouble();
            System.out.println();
            Triangle triangle = new Triangle(a, b, c);
            values = new ArrayList<>();
            values.add(triangle.calculatePerimeter());
            values.add(triangle.calculateArea());
            shapeList.put(objName, values);
        } else if (option == 4) {
            System.out.print("Enter your Square's name: ");
            String objName = userInputObjName.next();
            System.out.print("Enter square's side: ");
            double s = userInput.nextDouble();
            System.out.println();
            Square square = new Square(s);
            values = new ArrayList<>();
            values.add(square.calculatePerimeter());
            values.add(square.calculateArea());
            shapeList.put(objName, values);
        } else if (option == 5) {
            System.out.print("Enter your Equilateral Triangle's name: ");
            String objName = userInputObjName.next();
            System.out.print("Enter equilateral triangle's side: ");
            double s = userInput.nextDouble();
            System.out.println();
            EquilateralTriangle equilateralTriangle = new EquilateralTriangle(s);
            values = new ArrayList<>();
            values.add(equilateralTriangle.calculatePerimeter());
            values.add(equilateralTriangle.calculateArea());
            shapeList.put(objName, values);
        } else if (option == 6) {
            System.out.print("Enter your Regular Pentagon's name: ");
            String objName = userInputObjName.next();
            System.out.print("Enter regular pentagon's side: ");
            double s = userInput.nextDouble();
            System.out.println();
            RegularPentagon regularPentagon = new RegularPentagon(s);
            values = new ArrayList<>();
            values.add(regularPentagon.calculatePerimeter());
            values.add(regularPentagon.calculateArea());
            shapeList.put(objName, values);
        }
    }

    public void getShapesTable() {
        System.out.println("/" + "-".repeat(50) + "\\");
        System.out.println(String.format("|%-26s| %10s| %10s|", "Shape", "Perimeter", "Area"));
        shapeList.forEach((k, v) -> {
            System.out.println("-".repeat(52));
            System.out.println(String.format("|%-26s| %10.2f| %10.2f|", k, v.get(0), v.get(1)));
        });
        System.out.println("\\" + "-".repeat(50) + "/\n");
    }

    public void getLargestShapeByPerimeter() {
        HashMap<String, Double> shapeListPerimeter = new HashMap<>();
        shapeList.forEach((key, value) -> {
            shapeListPerimeter.put(key, value.get(0));
        });

        Map.Entry<String, Double> maxPerimeter = null;

        for (Map.Entry<String, Double> i: shapeListPerimeter.entrySet()) {
            if (maxPerimeter == null || i.getValue() > maxPerimeter.getValue()) {
                maxPerimeter = i;
            }
        }

        assert maxPerimeter != null;
        String maxKey = maxPerimeter.getKey();
        double maxValue = maxPerimeter.getValue();

        System.out.printf("%s: %.2f\n", maxKey, maxValue);
    }

    public void getLargestShapeByArea() {
        HashMap<String, Double> shapeListArea = new HashMap<>();
        shapeList.forEach((key, value) -> {
            shapeListArea.put(key, value.get(1));
        });

        Map.Entry<String, Double> maxArea = null;

        for (Map.Entry<String, Double> i: shapeListArea.entrySet()) {
            if (maxArea == null || i.getValue() > maxArea.getValue()) {
                maxArea = i;
            }
        }

        assert maxArea != null;
        String maxKey = maxArea.getKey();
        double maxValue = maxArea.getValue();

        System.out.printf("%s: %.2f\n", maxKey, maxValue);
    }


}
