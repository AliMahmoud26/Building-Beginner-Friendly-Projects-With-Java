import java.util.Scanner;

public class Calculator_3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Declaring the variables of the program
        double num1, num2, result;
        char operator;
        // Prompt the user for the first number
        System.out.print("Enter your first number: ");
        num1  = input.nextDouble();
        // Prompt the user for the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);
        // Prompt the user for the second number
        num2 = input.nextDouble();

        // Using switch case to perform the calculation
        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println("Result: " + result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println("Result: " + result);
            }
            case '*' -> {
                result =  num1 * num2;
                System.out.println("Result: " + result);
            }
            case '/' -> {
                if (num2 == 0) {
                    System.out.print("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
            }
            default -> {
                System.out.print("Error: Invalid operator.");
            }
        }
    }
}
