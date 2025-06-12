package io.github.bokalebsson;

import java.util.Scanner;

public class InputValidator {

    /* Checking for a valid operand:
    *  Stores user input as a string, and checks if the length of the string is 1,
    *  and that it contains the correct operands.
    *  Returns the char at index: 0 of the string.
    *  Asks the user for another input if the input is not valid.
    */
    public static char getValidOperand(Scanner scanner) {
        char operand;
        while (true) {
            System.out.print("Enter an operand (+, -, *, /): ");
            String input = scanner.next();
            if (input.length() == 1 && "+-*/".contains(input)) {
                operand = input.charAt(0);
                break;
            } else {
                System.out.println("Invalid operand.");
            }
        }
        return operand;
    }

     /* Checking for a valid number:
     *  Checks if the input is a numeric value.
     *  Returns the numeric value.
     *  Asks the user for another input if the input is not a numeric value.
     */
    public static double getValidNumber(Scanner scanner) {
        while (true) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid number. Please enter a numeric value.");
                scanner.next();
            }
        }
    }

}