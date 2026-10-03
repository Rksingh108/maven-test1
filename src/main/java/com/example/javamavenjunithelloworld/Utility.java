package com.example.javamavenjunithelloworld;

public class Utility {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    public static int bigger(int a, int b) {
        return Math.max(a, b);
    }

    public static int biggest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        return (double) a / b;
    }

    public static int squareOfSum(int a, int b) {
        return (a + b) * (a + b);
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double squareArea(double side) {
        return side * side;
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                    "Square root of negative number is not supported"
            );
        }

        return Math.sqrt(number);
    }

    public static void main(String[] args) {

    System.out.println(isEven(10));

    System.out.println(isDivisibleBy(20, 5));

    System.out.println(bigger(10, 20));

    System.out.println(biggest(10, 50, 30));

    printNumbers();

    System.out.println(isLeapYear(2024));

    System.out.println(add(10, 20));

    System.out.println(multiply(10, 20));

    System.out.println(divide(20, 5));

    System.out.println(squareOfSum(2, 3));

    System.out.println(circleArea(5));

    System.out.println(squareArea(5));

    System.out.println(rectangleArea(10, 5));

    System.out.println(triangleArea(10, 5));

    System.out.println(squareRoot(25));
}


}
