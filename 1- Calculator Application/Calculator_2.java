/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Ali Mahmoud
 */
public class Calculator_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaring Variables
        double num1, num2, result;
        char operator;
        
        // Entering your first number to process the calculation
        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();
        
        System.out.print("Enter and operator: (+, -, *, /, ^)");
        operator = input.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();
        
        switch(operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program if division by zero occurs
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> result = 0;
        }
        
        System.out.println(result);
        
        input.close();
    }
}
