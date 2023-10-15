package com.itkhanz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    /*@Test
    public void testInputValidation() {
        // You need to simulate input for non-numeric characters or values exceeding the int range
        // and assert that the appropriate error message is displayed.
        //This scenario is already handled in getUserInput() method
    }*/

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
}
