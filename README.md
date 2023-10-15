# Dreieck 3000

A simple java program to demonstrate the usage of unit tests written in JUnit.

* [Equilateral triangle](https://www.splashlearn.com/math-vocabulary/geometry/equilateral-triangle): All sides are equal in length.
* [Isosceles triangle](https://www.splashlearn.com/math-vocabulary/geometry/isosceles-triangle): Two sides are equal in length.
* [Scalene triangle](https://splashlearn.com/math-vocabulary/geometry/scalene-triangle): All sides have different lengths.
* [Types of Triangle](https://www.cuemath.com/geometry/types-of-triangle/)

* [Triangle Inequality Theorem](https://www.wikihow.com/Determine-if-Three-Side-Lengths-Are-a-Triangle)
  * This theorem simply states that the sum of two sides of a triangle must be greater than the third side.
  * If this is true for all three combinations, then you will have a valid triangle.

## Application
* This application accepts the three sides of a triangle as input from user, and validates if a triangle is formed.
* It returns and outputs the triangle type formed.
* It can handle the non-numeric, spaces, and inputs exceeding Integer range.
* It only allows the input between 1 and 99 (both inclusive) as valid input numbers.
* If user enters invalid number, it throws illegal argument exception with a descriptive error message.

* Below image demonstrates the application working

<img src="doc/app-flow.PNG">

## Requirements

* Java JDK 17
* Maven
* IDE (IntelliJ recommended to run the application and tests from within IDE)

## Running application
* Clone the repo, and open the `POM.xml` to download and install the project dependencies.
* Run the application and tests from within IDE or through commandline as below:
```shell
mvn clean compile
java -cp target/classes com.itkhanz.Triangle
```

> Once the application is compiled, you can also navigate to project root directory, 
> and run the command `run_triangle.bat` in the commandline to run the application.

## Running Tests
```shell
mvn clean test
```
* Here are the test results:

<img src="doc/test-results.PNG">

## Unit Tests

This application also has unit tests written using JUnit4 to test the important flows:

1. **Equilateral Triangle Test**: Provide three equal sides (e.g., 5, 5, 5) as input. The expected result is "Equilateral triangle."
2. **Isosceles Triangle Test**: Provide two equal sides (e.g., 3, 3, 4) as input. The expected result is "Isosceles triangle."
3. **Scalene Triangle Test**: Provide three different sides (e.g., 3, 4, 5) as input. The expected result is "Scalene triangle."
4. **Invalid Triangle Test**: Provide sides that cannot form a valid triangle (e.g., 1, 2, 3). The expected result is "Not a triangle."
5. **Minimum Value Test**: Provide the minimum possible values (1, 1, 1) as input.  The expected result is "Equilateral triangle."
6. **Maximum Value Test**: Provide the maximum possible values (99, 99, 99) as input. The expected result is "Equilateral triangle."
7. **Edge Case Test**: Test the edge case where one side has the minimum value (1), and the other two sides have maximum values (99). The expected result is "Scalene triangle."
8. **Large Difference Test**: Test a case where the difference between sides is large but still forms a valid triangle (e.g., 10, 30, 40). The expected result is "Scalene triangle."

Moreover, some unit test cases are also added for user input validation for following cases:
* Negative Number
* Zero
* Number outside the valid range
* Non-Numeric Inputs (character, Strings, space)
* Number exceeding Integer limit

* Below image demonstrates the input validation

<img src="doc/app-input-validation.PNG">
