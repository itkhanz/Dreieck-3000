package com.itkhanz;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TriangleTest {
    @Test
    public void testEquilateralTriangle() {
        Triangle triangle = new Triangle(5, 5, 5);
        assertEquals("Equilateral triangle (Gleichseitiges Dreieck)", triangle.checkTriangleType());
    }

    @Test
    public void testIsoscelesTriangle() {
        Triangle triangle = new Triangle(3, 3, 4);
        assertEquals("Isosceles triangle (Gleichschenkliges Dreieck)", triangle.checkTriangleType());
    }

    @Test
    public void testScaleneTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals("Scalene triangle (unregelmäßiges Dreieck)", triangle.checkTriangleType());
    }

    @Test
    public void testInvalidTriangle() {
        Triangle triangle = new Triangle(1, 2, 3);
        assertEquals("These sides do not form a valid triangle.", triangle.checkTriangleType());
    }

    @Test
    public void testMinimumValueTriangle() {
        Triangle triangle = new Triangle(1, 1, 1);
        assertEquals("Equilateral triangle (Gleichseitiges Dreieck)", triangle.checkTriangleType());
    }

    @Test
    public void testMaximumValueTriangle() {
        Triangle triangle = new Triangle(99, 99, 99);
        assertEquals("Equilateral triangle (Gleichseitiges Dreieck)", triangle.checkTriangleType());
    }

    @Test
    public void testEdgeCaseTriangle() {
        Triangle triangle = new Triangle(1, 99, 99);
        assertEquals("Isosceles triangle (Gleichschenkliges Dreieck)", triangle.checkTriangleType());
    }

    @Test
    public void testLargeDifferenceTriangle() {
        Triangle triangle = new Triangle(1, 49, 99);
        assertEquals("These sides do not form a valid triangle.", triangle.checkTriangleType());
    }

    @Test
    public void testInputValidationForSpace() {
        // Use assertThrows to verify that an IllegalArgumentException is thrown
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
           Triangle.getTriangleSideFromUserInput(" ");
        });

        // Verify the exception message
        assertEquals("Invalid input. Please enter a valid numeric Integer value.", exception.getMessage());
    }

    @Test
    public void testInputValidationForNonNumericCharacter() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Triangle.getTriangleSideFromUserInput("@");
        });
        assertEquals("Invalid input. Please enter a valid numeric Integer value.", exception.getMessage());
    }

    @Test
    public void testInputValidationForCharacter() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Triangle.getTriangleSideFromUserInput("c");
        });
        assertEquals("Invalid input. Please enter a valid numeric Integer value.", exception.getMessage());
    }

    @Test
    public void testInputValidationForString() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Triangle.getTriangleSideFromUserInput("I am invalid input");
        });
        assertEquals("Invalid input. Please enter a valid numeric Integer value.", exception.getMessage());
    }

    @Test
    public void testInputValidationForNumberGreaterThanIntLimit() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Triangle.getTriangleSideFromUserInput("10000000000000000000000");
        });
        assertEquals("Invalid input. Please enter a valid numeric Integer value.", exception.getMessage());
    }

    @Test
    public void testInputValidationForNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Triangle.getTriangleSideFromUserInput("-1");
        });
        assertEquals("Input should be between " + Triangle.MIN_VALUE + " and " + Triangle.MAX_VALUE + ".", exception.getMessage());
    }

    @Test
    public void testInputValidationForZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Triangle.getTriangleSideFromUserInput("0");
        });
        assertEquals("Input should be between " + Triangle.MIN_VALUE + " and " + Triangle.MAX_VALUE + ".", exception.getMessage());
    }

    @Test
    public void testInputValidationForNumberGreaterThanMaxLimit() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Triangle.getTriangleSideFromUserInput("100");
        });
        assertEquals("Input should be between " + Triangle.MIN_VALUE + " and " + Triangle.MAX_VALUE + ".", exception.getMessage());
    }

}
