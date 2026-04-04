import java.util.Scanner;

public class Calculator_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        char operator;

        System.out.println("Enter your first number: ");
        num1 = input.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.println("Enter your second number: ");
        num2 = input.nextDouble();

        switch(operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println("Result: " + result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println("Result: " + result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println("Result: " + result);
            }
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
            }
            default -> {
                System.out.println("Error: Invalid operator.");
            }
        }
    }
}