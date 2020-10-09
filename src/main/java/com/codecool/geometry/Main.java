package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;
import com.codecool.geometry.utilities.FormulaProvider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isRunning = true;
        Scanner userInput = new Scanner(System.in);


        ShapeCollection shapeCollection = new ShapeCollection();

        while (isRunning) {
            System.out.println(
                    "1. Add a new shape;\n" +
                            "2. Show all shapes;\n" +
                            "3. Show shape with the largest perimeter;\n" +
                            "4. Show shape with the largest area;\n" +
                            "5. Show formulas;\n" +
                            "0. Exit;"
            );
            System.out.print("Choose an option from above: ");
            int option = userInput.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    System.out.println(
                            "1. Circle;\n" +
                                    "2. Rectangle;\n" +
                                    "3. Triangle;\n" +
                                    "4. Square;\n" +
                                    "5. Equilateral Triangle;\n" +
                                    "6. Regular Pentagon;"
                    );
                    System.out.print("Please choose a shape from above to add: ");
                    int shapeToAdd = userInput.nextInt();
                    System.out.println();
                    shapeCollection.addShape(shapeToAdd);
                    break;
                case 2:
                    shapeCollection.getShapesTable();
                    break;
                case 3:
                    shapeCollection.getLargestShapeByPerimeter();
                    break;
                case 4:
                    shapeCollection.getLargestShapeByArea();
                    break;
                case 5:
                    System.out.println(
                            "1. Circle;\n" +
                                    "2. Rectangle;\n" +
                                    "3. Triangle;\n" +
                                    "4. Square;\n" +
                                    "5. Equilateral Triangle;\n" +
                                    "6. Regular Pentagon;"
                    );
                    System.out.print("Please choose a shape from above: ");
                    int shape = userInput.nextInt();
                    System.out.println();
                    System.out.println(FormulaProvider.getAreaForShape(shape) + ", " + FormulaProvider.getPerimeterForShape(shape));
                    break;
                case 0:
                    System.out.println("Adios!");
                    isRunning = false;
                    break;
            }
        }
    }

}
