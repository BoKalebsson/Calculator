package io.github.bokalebsson;

import java.util.List;
import java.util.Scanner;

public class MathOperations {

    public static double performCalculation(char operand, Scanner scanner) {
        double result = 0;

        switch (operand) {
            case '+': {
                List<Double> numbers = InputValidator.getNumberList(scanner);
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
                    return performCalculation(operand, scanner);  // fråga igen om division
                }
                break;
            }
        }

        return result;
    }
}