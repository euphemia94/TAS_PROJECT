package task;

import java.util.Scanner;

public class Task9b {
    public static void main(String[] args) {
        //Write a logic that takes in input from the user.
        // It keeps printing "try again "until the user enters "testify
        //to  write this logic using while loop

        //ist  Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input
        System.out.print("Please enter 'testify': ");
        String input = scanner.nextLine();

        // Keep asking the user until they enter 'testify'
        while (!input.equals("testify")) {
            System.out.println("Try again.");
            System.out.print("Please enter 'testify': ");
            input = scanner.nextLine();
        }
    }
}

}
