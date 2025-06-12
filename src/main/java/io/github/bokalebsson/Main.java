package io.github.bokalebsson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      /* List of demands:
       * - Maven project: check!
       *
       * Calculator should support:
       * - Addition: check!
       * - Subtraction: check!
       * - Multiplication: check!
       * - Division: check!
       *
       * User input demands:
       * - Enter the numbers: check!
       * - Enter the operand: check!
       * - Ask user to make another calculation or exit: check!
       *
       * Looping demands:
       * - Continue running until user ends the calculator: check!
       *
       * Optional demands:
       * - Subtraction and Addition should be able to process several numbers:
       * - Verify user inputs and handle invalid inputs:
       *   - Need to fix so you can write 1.6 and 1,6. At the moment it sees 1.6 as invalid input.
       * - JUnit tests:
       * */


        Scanner scanner = new Scanner(System.in);
        /* As long as boolean is true, the calculator will run. */
        boolean continueRunning = true;

        /* Some sort of greeting to the user. Replace with method later. */
        System.out.println("Welcome to the Calculator!\n");

        /* While-loop to ensure continuous running of the calculator until user exits.*/
        while (continueRunning) {

            /* Calls out to the InputValidator-class and the getValidNumber-method. */
            double numberOne = InputValidator.getValidNumber(scanner);

            /* Calls out to the InputValidator-class and the getValidOperand-method. */
            char operand = InputValidator.getValidOperand(scanner);

            /* Calls out to the InputValidator-class and the getValidNumber-method. */
            double numberTwo = InputValidator.getValidNumber(scanner);

            /* Declares the result and sets it to 0.
            *  Does the calculations depending on what case operand is.
            *  Checks for division by zero in case '/'.
            */
            double result = 0;
            switch (operand) {
                case '+':
                    result = numberOne + numberTwo;
                    break;
                case '-':
                    result = numberOne - numberTwo;
                    break;
                case '*':
                    result = numberOne * numberTwo;
                    break;
                case '/':
                    if (numberTwo != 0){
                        result = numberOne / numberTwo;
                    } else {
                        System.out.println("Division with 0 is not allowed.");
                        continue;
                    }
                    break;
            }
            /* Prints the result. */
            System.out.println("Result: " + result);

            /* Checks if user want to continue.*/
            System.out.println("Do you want to perform another calculation? (y/n): ");
            String userInput = scanner.next().toLowerCase();

            /* Changes the boolean to false, and exits the calculator.*/
            if (!userInput.equals("y")) {
                continueRunning = false;
                System.out.println("Goodbye!");
            }
        }


    }
}