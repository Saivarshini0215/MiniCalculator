package calculator;

public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    // Percentage
    public double percentage(double a, double b) {
        return (a * b) / 100;
    }

    // Power
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    // Square root
    public double squareRoot(double a) {
        if(a < 0) {
            System.out.println("Error: Cannot take square root of negative number!");
            return 0;
        }
        return Math.sqrt(a);
    }
}
