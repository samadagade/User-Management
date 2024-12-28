package pages; //package of this file

import resources.Messages; //to import Messages.java file
import java.util.Scanner; //to import Scanner file

/**
 * HelpPage class to display a help menu with various options for the user.
 * Includes information about the application, its usage, features, and
 * supported document formats.
 */

public class HelpPage {

    /**
     * Displays the help menu and processes user choices.
     */
    public static void displayHelpMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            // Display help menu options
            System.out.println("\n" + Messages.getMessage("helpMenu"));
            System.out.println(Messages.getMessage("aboutApp"));
            System.out.println(Messages.getMessage("howToUse"));
            System.out.println(Messages.getMessage("features"));
            System.out.println(Messages.getMessage("documentFormats"));
            System.out.println(Messages.getMessage("exitHelp"));

            System.out.print("\nEnter your choice (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    displayAbout();
                    break;
                case 2:
                    displayUsageInstructions();
                    break;
                case 3:
                    displayFeatures();
                    break;
                case 4:
                    displayDocumentFormats();
                    break;
                case 5:
                    System.out.println(Messages.getMessage("exitHelp"));
                    return;
                default:
                    System.out.println(Messages.getMessage("invalidChoice"));
            }
        }
    }

     /**
     * Displays information about the application.
     */
    private static void displayAbout() {
        System.out.println("\n" + Messages.getMessage("aboutAppDesc"));
        System.out.println(Messages.getMessage("aboutAppDocuments"));
    }

    /**
     * Displays usage instructions for the application.
     */
    private static void displayUsageInstructions() {
        System.out.println(Messages.getMessage("usageInstructions"));
        System.out.println(Messages.getMessage("usageInstructions2"));
    }
    
    /**
     * Displays features of the application
     */
    private static void displayFeatures() {
        System.out.println(Messages.getMessage("featuresDesc"));
        System.out.println(Messages.getMessage("featuresDesc2"));
    }

    /**
     * Displays the document formats supported by the application.
     */
    private static void displayDocumentFormats() {
        System.out.println(Messages.getMessage("documentFormatsDesc"));
        System.out.println(Messages.getMessage("documentFormatsDesc2"));
        System.out.println(Messages.getMessage("documentFormatsDesc3"));
    }

    public static void main(String[] args) {
        displayHelpMenu(); // Display the help menu to the user
    }
}
