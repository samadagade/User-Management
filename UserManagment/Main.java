import java.util.Scanner;
import models.AadharCard;
import models.PanCard;
import models.User;
import models.VoterCard;
import pages.HelpPage;
import resources.Messages;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the main menu options
            displayMainMenu();

            // Get the user's choice
            int choice = getUserChoice(scanner);

            // Handle the user's choice
            switch (choice) {
                case 1:
                    // Manage user profile
                    createUserProfile(scanner);
                    break;

                case 2:
                    // Display the help menu
                    HelpPage.displayHelpMenu();
                    break;

                case 3:
                    // Exit the application
                    System.out.println(Messages.getMessage("exitApp"));
                    scanner.close();
                    return;

                default:
                    // Handle invalid choices
                    System.out.println(Messages.getMessage("invalidChoice"));
            }
        }
    }

    // Method to display the main menu options
    private static void displayMainMenu() {
        System.out.println("\n" + Messages.getMessage("mainMenu"));
        System.out.println(Messages.getMessage("createUserProfile"));
        System.out.println(Messages.getMessage("viewHelp"));
        System.out.println(Messages.getMessage("exit"));
    }

    // Method to get the user's menu choice
    private static int getUserChoice(Scanner scanner) {
        System.out.print("\nEnter your choice (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        return choice;
    }

    // Method to handle user profile creation and updating
    private static void createUserProfile(Scanner scanner) {
        // Gather user details
        String name = getValidName(scanner);
        String gender = getValidGender(scanner);
        String dob = getValidDob(scanner);

        // Create user and associated documents
        User user = new User(name, gender, dob);
        PanCard panCard = new PanCard(user);
        AadharCard aadharCard = new AadharCard(user);
        VoterCard voterCard = new VoterCard(user);

        // Display user and card details
        System.out.println("\n" + Messages.getMessage("userDetails"));
        displayUserDetails(user, panCard, aadharCard, voterCard);

        // Prompt for updating user details
        if (askForUpdate(scanner)) {
            updateUserDetails(scanner, user);

            // Re-display updated details
            System.out.println("\n" + Messages.getMessage("updateDetails"));
            displayUserDetails(user, panCard, aadharCard, voterCard);
        }
    }

    // Method to display user and card details
    private static void displayUserDetails(User user, PanCard panCard, AadharCard aadharCard, VoterCard voterCard) {
        System.out.println("Name: " + user.getName());
        System.out.println("Gender: " + user.getGender());
        System.out.println("Age: " + user.getAge());
        System.out.println("Date of Birth: " + user.getDOB());

        System.out.println("Pan Card Number is : " + panCard.getPanNumber());
        System.out.println("Aadhar Card Number is : " + aadharCard.getAadharNumber());
        System.out.println("Voter Card Number is : " + voterCard.getVoterID());

        user.showUserEligibility();
    }

    // Method to check if the user wants to update their details
    private static boolean askForUpdate(Scanner scanner) {
        System.out.println("\n" + Messages.getMessage("updateConformation"));
        String updateChoice = scanner.nextLine();
        return updateChoice.equalsIgnoreCase("yes");
    }

    // Method to update user details (Name, Gender, DOB)
    private static void updateUserDetails(Scanner scanner, User user) {
        System.out.println("\nEnter new Name (or press Enter to skip): ");
        String newName = scanner.nextLine();
        if (!newName.isEmpty()) {
            user.setName(newName);
        }

        System.out.println("Enter new Gender (or press Enter to skip): ");
        String newGender = scanner.nextLine();
        if (!newGender.isEmpty()) {
            user.setGender(newGender);
        }

        System.out.println("Enter new Date of Birth (DD/MM/YYYY) (or press Enter to skip): ");
        String newDob = scanner.nextLine();
        if (!newDob.isEmpty()) {
            user.setDOB(newDob);
        }
    }

    // Method to get a valid Name input
    private static String getValidName(Scanner scanner) {
        System.out.print("Enter Name: ");
        return scanner.nextLine();
    }

    // Method to get a valid Gender input
    private static String getValidGender(Scanner scanner) {
        String gender;
        while (true) {
            System.out.print("Enter Gender: ");
            gender = scanner.nextLine();
            if (isValidGender(gender)) {
                break;
            } else {
                System.out.println("Invalid Gender. Please enter Male, Female, or Other.");
            }
        }
        return gender;
    }

    // Helper method to validate gender input
    private static boolean isValidGender(String gender) {
        return gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Other");
    }

    // Method to get a valid Date of Birth input
    private static String getValidDob(Scanner scanner) {
        String dob;
        while (true) {
            System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
            dob = scanner.nextLine();
            if (dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
                break;
            } else {
                System.out.println("Invalid Date format. Please enter in the format DD/MM/YYYY.");
            }
        }
        return dob;
    }
}
