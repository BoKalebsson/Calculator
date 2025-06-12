package io.github.bokalebsson;

import java.util.Scanner;

public class InputValidator {
    public static char getValidOperand(Scanner scanner) {
        while (true) {
            System.out.print("Enter an operand (+, -, *, /): ");

            if (scanner.hasNext()) {
                String input = scanner.next(); // Takes user input as a string.
                if (input.length() == 1) {
                    char operand = input.charAt(0);
                    if (isValidOperand(operand)) {
                        return operand;
                    }
                }
            }
            System.out.println("Invalid operand. Please enter one of: +, -, *, /");
        }
    }

public static boolean isValidOperand(char operand) {
   return operand == '+' || operand == '-' || operand == '*' || operand == '/';

    }
}
