package se.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            CurrencyConverter converter = new CurrencyConverter();
            converter.displayMenu();
/*
            CurrencyConverter.displayMenu();
*/
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number from the menu.");
                scanner.next();
            }
            choice = scanner.nextInt();
            CurrencyConverter.currencyConverter(choice, scanner);

        } while (choice != 0);

        scanner.close();
    }
}