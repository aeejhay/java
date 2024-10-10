/*
* MakingChangeApp.java
* @author AJ.Mole
* 01/10/2024
*/

import java.util.Scanner;  // Importing the Scanner class for input

public class MakingChangeApp {
    public static void main(String[] args) {
        // 1. Declaring variables
        double totalCost;  // To store the total cost of shopping
        double amountPaid;  // To store the amount paid by the customer
        int changeInEuros;  // To store the change in whole euros (ignoring cents)
        int fiftyEuroNotes, twentyEuroNotes, tenEuroNotes, fiveEuroNotes;
        int twoEuroCoins, oneEuroCoins;

        // 2. Input: Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Asking for the total cost and amount paid
        System.out.print("Enter the total cost of the shopping: ");
        totalCost = scanner.nextDouble();

        System.out.print("Enter the amount paid by the customer: ");
        amountPaid = scanner.nextDouble();

        // 3. Process: Calculate total change in euros (ignoring any cents)
        changeInEuros = (int) (amountPaid - totalCost);

        // Check if the amount paid is enough
        if (changeInEuros < 0) {
            System.out.println("The customer hasn't paid enough.");
        } else {
            // Calculate how many 50 Euro notes to give
            fiftyEuroNotes = changeInEuros / 50;
            changeInEuros = changeInEuros % 50;  // Update change after 50 Euro notes

            // Calculate how many 20 Euro notes to give
            twentyEuroNotes = changeInEuros / 20;
            changeInEuros = changeInEuros % 20;  // Update change after 20 Euro notes

            // Calculate how many 10 Euro notes to give
            tenEuroNotes = changeInEuros / 10;
            changeInEuros = changeInEuros % 10;  // Update change after 10 Euro notes

            // Calculate how many 5 Euro notes to give
            fiveEuroNotes = changeInEuros / 5;
            changeInEuros = changeInEuros % 5;  // Update change after 5 Euro notes

            // Calculate how many 2 Euro coins to give
            twoEuroCoins = changeInEuros / 2;
            changeInEuros = changeInEuros % 2;  // Update change after 2 Euro coins

            // Calculate how many 1 Euro coins to give
            oneEuroCoins = changeInEuros;  // Whatever remains is 1 Euro coins

            // 4. Output: Display the result
            System.out.println("Change breakdown:" +
            "\n50 Euro notes: " + fiftyEuroNotes +
            "\n20 Euro notes: " + twentyEuroNotes +
            "\n10 Euronotes: " + tenEuroNotes +
            "\n5 Euro notes: " + fiveEuroNotes +
            "\n2 Euro coins: " + twoEuroCoins +
            "\n1 Euro coins: " + oneEuroCoins);
        }
    }
}
