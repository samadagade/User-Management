package models;

import java.util.Scanner;

public class PanCard {
    private User user;
    private String panNumber;

    public PanCard(User user) {
        this.user = user;

        // Validate the PAN number when the object is created
        validatePanNumber();
    }

    public void validatePanNumber() {
        Scanner scanner = new Scanner(System.in);

        // Keep prompting the user for the correct PAN number format
        while (true) {
            System.out.print("Enter PAN Number: ");

            panNumber = scanner.nextLine();
            // Validate the PAN format (5 letters, 4 digits, 1 letter)
            if (panNumber.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
                System.out.println("Pan Number is Valid.");
                break; // Exit the loop if PAN is valid
            } else {
                System.out.println("Invalid PAN number format. Please enter a valid PAN number (e.g., ABCDE1234F).");
            }
        }
    }

    public String getPanNumber() {
        return this.panNumber;
    }
}
