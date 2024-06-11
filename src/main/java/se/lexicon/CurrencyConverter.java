package se.lexicon;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CurrencyConverter {


    public static void convertCurrencyValidation(Scanner scanner, String fromCurrency, String toCurrency, double rate) {
        System.out.print("Enter amount in " + fromCurrency + ": ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next();
        }
        double amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid input. Amount cannot be negative.");
            return;
        }

        double convertedAmount = amount * rate;
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedAmount = df.format(convertedAmount);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = sdf.format(new Date());

        System.out.println("Converted Amount: " + formattedAmount + " " + toCurrency);
        System.out.println("Conversion Date and Time: " + currentDate);
    }

    public static void currencyConverter(int choice, Scanner scanner) {
        double SEK_TO_USD = 0.11;
        final double SEK_TO_EURO = 0.095;
        final double USD_TO_SEK = 9.11;
        final double USD_TO_EURO = 0.86;
        final double EURO_TO_SEK = 10.58;
        final double EURO_TO_USD = 1.16;

        switch (choice) {
            case 0:
                System.out.println("Exiting the program. Goodbye!");
                break;
            case 1:
                convertCurrencyValidation(scanner, "SEK", "USD", SEK_TO_USD);
                break;
            case 2:
                convertCurrencyValidation(scanner, "SEK", "Euro", SEK_TO_EURO);
                break;
            case 3:
                convertCurrencyValidation(scanner, "USD", "SEK", USD_TO_SEK);
                break;
            case 4:
                convertCurrencyValidation(scanner, "USD", "Euro", USD_TO_EURO);
                break;
            case 5:
                convertCurrencyValidation(scanner, "Euro", "SEK", EURO_TO_SEK);
                break;
            case 6:
                convertCurrencyValidation(scanner, "Euro", "USD", EURO_TO_USD);
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option from the menu.");
        }
    }

    public void displayMenu() {
        System.out.println("\nCurrency Converter Menu:");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert SEK to Euro");
        System.out.println("3. Convert USD to SEK");
        System.out.println("4. Convert USD to Euro");
        System.out.println("5. Convert Euro to SEK");
        System.out.println("6. Convert Euro to USD");
        System.out.println("0. Exit");
        System.out.print("Please choose an option: ");
    }
}

