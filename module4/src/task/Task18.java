package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        //Write a code that asks the user for age and that accepts the Integer value. Handle
        // the error that is encountered when the users tries to enter a name instead of age

        Scanner scanner = new Scanner(System.in);
        int age = 0; // Initializing age variable

        try {System.out.print("Enter your age: ");
            age = scanner.nextInt(); // Try to read an integer from input
            System.out.println("Your age is: " + age);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer age.");
        }

    }
}