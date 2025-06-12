package io.github.bokalebsson;

import java.util.Scanner;

import static io.github.bokalebsson.UserInterface.showWelcomeMessage;

public class Main {
    public static void main(String[] args) {

      /* List of demands:
       * - Subtraction and Addition should be able to process several numbers:
       *   - Some sort of list of double is required.
       *       - To let the user determine on how many numbers will be added to the list
       *         beforehand feels clunky. "How many numbers to you want to add?"
       *         I don't like that solution.
       *   - Some sort of while true loop is required.
       *   - Some sort of user input for stop typing numbers is needed.
       *       - If user types done, break the loop.
       *       - As long as user is not done, add number to numbers-list.
       * - JUnit tests: Check out what this is.
       *
       *  - Todo for tomorrow:
       *     - Breakout the case to MathOperations.java.
       *     - Finish the support for adding and subtracting several numbers.
       *     - See what JUnit tests is.
       */

        Scanner scanner = new Scanner(System.in);

        boolean continueRunning = true;

        showWelcomeMessage();

        /* While-loop to ensure continuous running of the calculator until user exits.*/
        while (continueRunning) {

            double numberOne = InputValidator.getValidNumber(scanner);

            char operand = InputValidator.getValidOperand(scanner);

            double numberTwo = InputValidator.getValidNumber(scanner);

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

            /* Prints the result. Replace with method later. */
            System.out.println("\nResult: " + numberOne + " " + operand+ " "  + numberTwo + " = "  + result);

            continueRunning = UserInterface.askToContinue(scanner);

        }

    }
}