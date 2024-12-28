package models;

import java.util.Scanner;

public class AadharCard {
    private User user;
    private String aadharNumber;

    public AadharCard(User user) {
        this.user = user;
        validateAadharNumber();   //validating aadhar number while creating the object
    }

    /**
     * Method Take aadhar number from user
     * Validate the aadhar number should be of 12 digit.
     */
    public void validateAadharNumber() {
        Scanner scanner = new Scanner(System.in); // Do not close this Scanner

        // Keep prompting the user for the correct Aadhar number format
        while (true) {
            System.out.print("Enter Aadhar Number: ");

            aadharNumber = scanner.nextLine().trim();

            // Validate the Aadhar number format (12 digits)
            if (aadharNumber.matches("[0-9]{12}")) {
                System.out.println("Aadhar Number is Valid.");
                break; // Exit the loop if the number is valid
            } else {
                System.out.println("Invalid Aadhar number format. Please enter a valid Aadhar number (12 digits).");
            }
        }
    }
 
    /**
     * method to get aadhar number
     * @return aadhar number
     */
    public String getAadharNumber() {
        return this.aadharNumber;
    }
}
