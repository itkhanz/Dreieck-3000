package com.itkhanz;

import java.util.Scanner;

/*
Equilateral triangle: All sides are equal in length.
Equilateral triangle: All sides are equal in length.
Equilateral triangle: All sides are equal in length.
Triangle Inequality Theorem
This theorem simply states that the sum of two sides of a triangle must be greater than the third side.
If this is true for all three combinations, then you will have a valid triangle.
*/
public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean isTriangleEquilateral() {
        return side1 == side2 && side2 == side3;
    }
    private boolean isTriangleIsosceles() {
        return side1 == side2 || side2 == side3 || side1 == side3;
    }
    private boolean isTriangleScalene() {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    public String checkTriangleType() {
        if (isTriangleEquilateral()) {
            return "Equilateral triangle (Gleichseitiges Dreieck)";
        } else if (isTriangleIsosceles()) {
            return "Isosceles triangle (Gleichschenkliges Dreieck)";
        } else if (isTriangleScalene()) {
            return "Scalene triangle (unregelmäßiges Dreieck)";
        } else {
            return "These sides do not form a valid triangle.";
        }
    }

    public static int getUserInput(Scanner scanner, String message) {
        int userInput = -1;
        int minValue = 1;
        int maxValue = 99;

        while (true) {
            try {
                System.out.print(message);
                String inputLine = scanner.nextLine();
                //This approach handles cases where the input number exceeds the int range and provides appropriate feedback to the user.
                //This will also catch the space in NumberFormatException
                userInput = Integer.parseInt(inputLine);

                if (userInput >= minValue && userInput <= maxValue) {
                    break;
                } else {
                    System.out.println("Input should be between " + minValue + " and " + maxValue + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric Integer value.");
            }
        }

        return userInput;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle one by one; only natural numbers between 1 and 99 are allowed");
        int side1 = getUserInput(scanner, "Enter the first side of the triangle: ");
        int side2 = getUserInput(scanner, "Enter the second side of the triangle: ");
        int side3 = getUserInput(scanner, "Enter the third side of the triangle: ");
        scanner.close(); // Close the Scanner when done

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Triangle type: " + triangle.checkTriangleType());
    }
}
