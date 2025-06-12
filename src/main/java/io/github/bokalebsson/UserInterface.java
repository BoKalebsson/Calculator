package io.github.bokalebsson;

import java.util.Scanner;

public class UserInterface {

    /* Shows a welcome message to the user then the calculator starts. */
    public static void showWelcomeMessage() {
        System.out.println("Welcome to the Calculator!");
        System.out.println("--------------------------");
    }
    /* Asks the user for input if they want to continue or exit the program.
    *  Will say goodbye to the user if they decide to exit the program.
    *  Will accept both y or yes, n or no as answers.
    *  Will print an error message to user if they write something else.
    */
    public static boolean askToContinue(Scanner scanner) {
        while (true) {
            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            String input = scanner.next().trim().toLowerCase();

            if (input.equals("y") || input.equals("yes")) {
                return true;
            } else if (input.equals("n") || input.equals("no")) {
                System.out.println("\nGoodbye and thanks for using the Calculator!");
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }
    }


}
