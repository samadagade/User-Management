# User Management System

A Java-based console application for managing multiple identification cards (Voter Card, PAN Card, Aadhaar Card) with updates synchronized across all cards using Object-Oriented Programming (OOP) principles.

## Features

- **Centralized User Management:** Updates to user information in a single class are automatically reflected in all associated cards.
- **Console-Based UI:** Easy-to-use interface for managing cards directly from the console.
- **Properties File for Messages:** All hardcoded messages are centralized in a `messages.properties` file for easy localization and customization.

## Project Structure

```
CardManagementSystem/
├── src/
│   ├── Main.java
│   ├── User.java
│   ├── VoterCard.java
│   ├── PANCard.java
│   ├── AadhaarCard.java
│   └── utils/
│       └── MessageLoader.java
├── resources/
│   └── messages.properties
├── README.md
└── build/
```

### Key Components

- **`User.java`:** Represents the user and manages the information shared across all cards.
- **`VoterCard.java`:** Handles voter card-specific functionality.
- **`PANCard.java`:** Manages PAN card-related details.
- **`AadhaarCard.java`:** Covers Aadhaar card-specific features.
- **`MessageLoader.java`:** Utility to load messages from the `messages.properties` file.
- **`Main.java`:** Entry point for the application with a console-based UI.
- **`messages.properties`:** Contains all user-facing messages.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- IDE or text editor for Java development (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code)

### Setup

1. Clone the repository:

   ```bash
   git clone <repository-url>
   ```

2. Open the project in your preferred IDE.

3. Ensure the `messages.properties` file is in the `resources` directory.

4. Run `Main.java` to start the application.

### Example Messages File (`messages.properties`)

```properties
welcome.message=Welcome to the Card Management System
update.success=Information updated successfully!
error.invalid.input=Invalid input. Please try again.
exit.message=Thank you for using the Card Management System.
```

## Usage

1. Launch the application from the console.
2. Follow the prompts to update user details.
3. View changes reflected across Voter Card, PAN Card, and Aadhaar Card.
4. Exit the application when done.

## OOP Principles Demonstrated

- **Encapsulation:** User and card data are managed in separate classes with controlled access.
- **Inheritance:** Common functionality is inherited where applicable.
- **Polymorphism:** Methods are overridden for card-specific functionality.

## Future Enhancements

- Add GUI support using JavaFX or Swing.
- Integrate database for persistent storage.
- Include additional card types (e.g., Driving License, Passport).

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the [MIT License](LICENSE).
