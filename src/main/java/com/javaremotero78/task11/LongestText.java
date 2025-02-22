package com.javaremotero78.task11;

import java.util.Scanner;

public class LongestText {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Variable to store the longest text
        String longestText = null;

        // Read input until "Enough!" is entered
        while (true) {
            System.out.print("Enter text (or type 'Enough!' to stop): ");
            String input = scanner.nextLine();

            // Check if the user entered "Enough!"
            if (input.equals("Enough!")) {
                break;  // Exit the loop if "Enough!" is entered
            }

            // If no text was entered, continue to the next input
            if (input.isEmpty()) {
                continue;   // Continues while loop with next iteration
            }

            // If longestText is null (no text processed yet), initialize it
            if (longestText == null || input.length() > longestText.length()) {
                longestText = input;  // Update longestText if the current input is longer
            }
        }

        // Output the result
        if (longestText != null) {
            System.out.println("Longest text: " + longestText);
        } else {
            System.out.println("No text provided");
        }

        // Close the scanner
        scanner.close();
    }
}

