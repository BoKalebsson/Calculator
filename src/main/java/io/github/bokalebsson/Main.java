package io.github.bokalebsson;

import java.util.Scanner;

import static io.github.bokalebsson.UserInterface.showWelcomeMessage;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        showWelcomeMessage();

        /* While-loop with calls to separate methods, until the user exits.*/
        while (continueRunning) {
            char operand = InputValidator.getValidOperand(scanner);
            MathOperations.performCalculation(operand, scanner);
            continueRunning = UserInterface.askToContinue(scanner);
        }
    }
}
