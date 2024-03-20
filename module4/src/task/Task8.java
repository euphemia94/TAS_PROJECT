package task;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //Build a Simple interest calculator. Write a program to ask
        // the user for the necessary field you need in calculating the
        // simple interest and then communicate
        // the simple interest back to the user is a good sentenc

        //ist Create a Scanner object to read input

        Scanner userInput = new Scanner(System.in);
        // Ask the user for necessary fields
        System.out.print("Enter the principal amount: ");
        int userInputP = userInput.nextInt();

        System.out.print("Enter the rate of interest (in percentage): ");
        int userInputR = userInput.nextInt();

        System.out.print("Enter the time period (in years): ");
        int userInputT = userInput.nextInt();

        // Calculate Simple Interest
        double simpleInterest = (userInputP * userInputR * userInputT) / 100;

        // Communicate the Simple Interest back to the user
        System.out.println("The Simple Interest calculated is: " + simpleInterest);




    }
}
