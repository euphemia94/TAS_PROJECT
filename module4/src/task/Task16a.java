package task;

public class Task16a {
    //OVERLOADING: Create a method in a class and Overload in using the 3
    // different ways of overloading that you know

    // Method Overloading by changing number of parameters
    public void printMessage(String type) {
        System.out.println("Hello, World!");
    }

    public void printMessage(String message, String anotherMassage) {
        System.out.println(message);
    }

    // Method Overloading by changing data types of parameters
    public void printMessage(int num) {
        System.out.println("The number is: " + num);
    }

    public void printMessage(double num) {
        System.out.println("The number is: " + num);
    }

    // Method Overloading by changing sequence of parameters
    public void printMessage(String message, int num) {
        System.out.println(message + " " + num);
    }

    public void printMessage(int num, String message) {
        System.out.println(num + " " + message);
    }



}
