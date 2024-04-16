package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter different parts of their name
        System.out.println("Please Enter Your Name.");

        System.out.print("Enter your First Name: ");
        String firstName = scanner.nextLine();

        //If you don't have a middle name press enter to move forward in output
        System.out.print("Enter your Middle Name (if any): ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your Last Name: ");
        String lastName = scanner.nextLine();

        //If you don't have a suffix press enter to move forward in output
        System.out.print("Enter your suffix (if any): ");
        String suffix = scanner.nextLine();

        //Construct the full name based on user input
        String fullName = firstName + (middleName.equals("") ? "" : " " + middleName) + " " + lastName + (suffix.equals("") ? "" : ", " + suffix);

        //Display the full name
        System.out.println("Your Full Name is: " + fullName);

        scanner.close();
    }
}
