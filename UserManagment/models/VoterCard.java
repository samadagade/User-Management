package models;

import java.util.Scanner;

public class VoterCard {
    private User user;
    private String voterID;

    //public constructor
    public VoterCard(User user) {
        this.user = user;
        validateVoterNumber();
    }
    
    //method for validate take voterID and validate it
    public void validateVoterNumber() {
        Scanner scanner = new Scanner(System.in);

        // Keep prompting the user for the correct PAN number format
        while (true) {

            //input voter ID
            System.out.print("Enter Voter ID : ");
            voterID = scanner.nextLine();

            // Validate the PAN format (5 letters, 4 digits, 1 letter)
            if (voterID.matches("[A-Z]{3}[0-9]{6}")) {
                System.out.println("Voter ID is Valid.");
                break; // Exit the loop if PAN is valid
            } else {
                System.out.println("Invalid Voter ID format. Please enter a valid Voter ID (e.g., ABC123456).");
            }

        }
    }
  
    //method to get voting details
    public String getVoterID() {
       return voterID;
    }
}
