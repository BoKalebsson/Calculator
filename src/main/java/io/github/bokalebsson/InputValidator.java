package io.github.bokalebsson;

import java.util.ArrayList;
import java.util.List;
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
     *  Replaces ',' with '.' and changes the string to a double.
     *  Prints an error message if not a numerical value.
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

    /* Checks for a valid list of numbers:
    *  Creates a list of doubles, and ask the user for inputs.
    *  The loop will continue until user types done.
    *  Fixes ',' to '.', and checks for invalid inputs and no input.
    *  Returns the list of numbers.
    */
    public static List<Double> getNumberList(Scanner scanner) {
        List<Double> numbers = new ArrayList<>();
        System.out.println("\nEnter numbers one at a time. Type 'done' to finish:");

        while (true) {
            String input = scanner.next().trim().toLowerCase();

            if (input.equals("done")) {
                if (numbers.isEmpty()) {
                    System.out.println("You must enter at least one number.");
                    continue;
                }
                break;
            }

            try {
                double number = Double.parseDouble(input.replace(",", "."));
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid number or 'done'.");
            }
        }

        return numbers;
    }

}