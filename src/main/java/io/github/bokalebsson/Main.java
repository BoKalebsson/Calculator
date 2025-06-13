package io.github.bokalebsson;

import java.util.List;
import java.util.Scanner;

import static io.github.bokalebsson.UserInterface.showWelcomeMessage;

public class Main {
    public static void main(String[] args) {

        /* List of demands:
         * - JUnit tests: Check out what this is.
         */

        Scanner scanner = new Scanner(System.in);

        boolean continueRunning = true;

        showWelcomeMessage();

        /* While-loop to ensure continuous running of the calculator until user exits.*/
        while (continueRunning) {
            char operand = InputValidator.getValidOperand(scanner);
            double result = 0;

            switch (operand) {
                case '+': {
                    List<Double> numbers = InputValidator.getNumberList(scanner);
                    result = 0;
                    for (double num : numbers) {
                        result += num;
                    }
                    System.out.println("\nResult: " + UserInterface.formatListString(numbers, "+") + " = " + result);
                    break;
                }

                case '-': {
                    List<Double> numbers = InputValidator.getNumberList(scanner);
                    result = numbers.get(0);
                    for (int i = 1; i < numbers.size(); i++) {
                        result -= numbers.get(i);
                    }
                    System.out.println("\nResult: " + UserInterface.formatListString(numbers, "-") + " = " + result);
                    break;
                }

                case '*': {
                    double numberOne = InputValidator.getValidNumber(scanner);
                    double numberTwo = InputValidator.getValidNumber(scanner);
                    result = numberOne * numberTwo;
                    System.out.println("\nResult: " + numberOne + " * " + numberTwo + " = " + result);
                    break;
                }

                case '/': {
                    double numberOne = InputValidator.getValidNumber(scanner);
                    double numberTwo = InputValidator.getValidNumber(scanner);
                    if (numberTwo != 0) {
                        result = numberOne / numberTwo;
                        System.out.println("\nResult: " + numberOne + " / " + numberTwo + " = " + result);
                    } else {
                        System.out.println("Division with 0 is not allowed.");
                        continue;
                    }
                    break;
                }
            }
            continueRunning = UserInterface.askToContinue(scanner);
        }
    }
}
