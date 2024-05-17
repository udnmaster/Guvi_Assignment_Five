package com.demo.assignmentFive;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        // Parse the input string into a LocalDate object
        LocalDate birthDate = LocalDate.parse(input);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate age
        Period age = Period.between(birthDate, currentDate);

        // Display age
        System.out.println("Your age is: " + age.getYears() + " years, " +
                age.getMonths() + " months, and " + age.getDays() + " days.");

        scanner.close();
    }
}
