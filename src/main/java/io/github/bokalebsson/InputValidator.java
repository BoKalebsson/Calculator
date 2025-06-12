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
     *  Takes user input as a string
     *
     *  Asks the user for another input if the input is not a numeric value.
     *  For some reason a number like 1.6 triggers Invalid number, but 1,6 works.
     */
    public static double getValidNumber(Scanner scanner) {
        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.next().replace(",", ".");
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a numeric value.");
            }
        }
    }

}