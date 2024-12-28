package models;

//all about user

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import resources.Messages;

/**
 * Represents a User with details such as name, gender, and date of birth.
 * Includes methods for calculating age, determining eligibility, and displaying
 * user details.
 */
public class User {
    private String name; // user's name
    private String gender; // user's gender
    private String dob; // User's date of birth in "dd/MM/yyyy" format

    public User(String name, String gender, String dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }


    // getter and setter of Name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // getter and setter of Gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    // getter and setter for DOB
    public String getDOB() {
        return dob;
    }

    public void setDOB(String dOb) {
        this.dob = dOb;
    }


    /**
     * Calculates the user's age based on their date of birth.
     * 
     * @return Age of the user in years.
     */
    public int getAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter); // Convert DOB string to LocalDate
        LocalDate currentDate = LocalDate.now(); // Get the current date
        return Period.between(birthDate, currentDate).getYears(); // Calculate the age
    }


    /**
     * Displays the user's eligibility based on their age.
     * Uses external message resources for output.
     */

    public void showUserEligibility() {
        int currentAge = getAge(); // Calculating age from DOB

        System.out.println("\n" + Messages.getMessage("userEligibility"));

        if (currentAge < 18) {
            System.out.println(Messages.getMessage("minorEligible"));
            System.out.println(Messages.getMessage("voteNotEligible"));
        } else {
            System.out.println(Messages.getMessage("majorEligible"));
            System.out.println(Messages.getMessage("voteEligible"));
        }
    }

    // Displays all user details.
    public void getUserDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age: " + getAge());
        System.out.println("DOB: " + dob);
        System.out.println("Gender: " + gender);
    }

}
