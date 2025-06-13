package io.github.bokalebsson;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    /* Shows a welcome message to the user then the calculator starts */
    public static void showWelcomeMessage() {
        System.out.println("Welcome to the Calculator!");
        System.out.println("--------------------------\n");
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

    /* Make the list of numbers print prettier:
    * It eliminates the long strings where you manually add the + or -.
    * The method takes a list of doubles, and a symbol as an input.
    * Loops through the list, from start to finish.
    * It adds " ", "symbol", " " between the numbers in the list.
    * Symbols is added in the + and - case switch.
    */
    public static String formatListString(List<Double> numbers, String symbol) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            stringBuilder.append(numbers.get(i));
            if (i < numbers.size() - 1) {
                stringBuilder.append(" ").append(symbol).append(" ");
            }
        }
        return stringBuilder.toString();

    }
}
