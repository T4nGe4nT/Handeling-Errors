package org.example;

public class Main {
    public static void main(String[] args) {
        // Test Person class
        try {
            Person person1 = new Person("Alice", 30);
            System.out.println("Person created: " + person1.getName() + ", age: " + person1.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Person person2 = new Person("", 25); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Person person3 = new Person("Bob", 150); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Test Calculator class
        Calculator calculator = new Calculator();

        try {
            int factorialResult = calculator.factorial(5);
            System.out.println("Factorial of 5: " + factorialResult);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int factorialResult = calculator.factorial(-1); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int binomialCoefficientResult = calculator.binomialCoefficient(5, 2);
            System.out.println("Binomial coefficient of 5 choose 2: " + binomialCoefficientResult);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int binomialCoefficientResult = calculator.binomialCoefficient(5, 6); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
