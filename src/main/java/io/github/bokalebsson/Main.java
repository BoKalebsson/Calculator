package io.github.bokalebsson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      /* List of demands:
       * - Maven project: check!
       *
       * Calculator should support:
       * - Addition:
       * - Subtraction:
       * - Multiplication:
       * - Division:
       *
       * User input demands:
       * - Enter the numbers:
       * - Enter the operand:
       * - Ask user to make another calculation or exit:
       *
       * Looping demands:
       * - Continue running until user ends the calculator:
       *
       * Optional demands:
       * - Subtraction and Addition should be able to process several numbers:
       * - Verify user inputs and handle invalid inputs:
       * - JUnit tests:
       * */


        Scanner scanner = new Scanner(System.in);
        /* As long as boolean is true, the calculator will run. */
        boolean continueRunning = true;

        /* Some sort of greeting to the user. */
        System.out.println("Welcome to the Calculator!");

        /* While-loop to ensure continuous running of the calculator until user exits.*/
        while (continueRunning) {

            System.out.print("Enter a number: ");
            int numberOne = scanner.nextInt();

            char operand = InputValidator.getValidOperand(scanner);

            System.out.print("Enter a number: ");
            int numberTwo = scanner.nextInt();

            /* Reserved for Case*/
            int result = 0;

            /* Need checks for:
            *  -
            *
            * */


            /* Reserved for Case*/

            /* Reserved for printing out the result. */


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