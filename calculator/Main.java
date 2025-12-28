package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        History history = new History();

        while(true) {
            System.out.println("\n--- Mini Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Show History");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch(Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // clear invalid input
                continue;
            }

            double num1 = 0, num2 = 0, result = 0;

            switch(choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    break;
                case 7:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    break;
                case 8:
                    history.showHistory();
                    continue;
                case 9:
                    System.out.println("Exiting Calculator. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            switch(choice) {
                case 1:
                    result = calc.add(num1, num2);
                    break;
                case 2:
                    result = calc.subtract(num1, num2);
                    break;
                case 3:
                    result = calc.multiply(num1, num2);
                    break;
                case 4:
                    result = calc.divide(num1, num2);
                    break;
                case 5:
                    result = calc.percentage(num1, num2);
                    break;
                case 6:
                    result = calc.power(num1, num2);
                    break;
                case 7:
                    result = calc.squareRoot(num1);
                    break;
            }

            System.out.println("Result: " + result);
            history.addRecord("Operation: " + choice + " | Numbers: " + num1 + ", " + num2 + " | Result: " + result);
        }
    }
}
