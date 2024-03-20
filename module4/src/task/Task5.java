package task;

public class Task5 {
    public static void main(String[] args) {
        //Write a code to: If the number is divisible by 3, print Fizz instead of the number.
        //If the number is divisible by 5, print Buzz instead of the number.
        //If the number is divisible by 3 and 5 both, print FizzBuzz instead of the number.
        int myAge = 20;
        if (myAge % 3 == 0){
            System.out.println("Fizz");
        } else if (myAge % 5 == 0) {
            System.out.println("Buzz");
        } //if both 3 and 5 can divide myAge
        else {
            System.out.println("FizzBuzz");
        }

    }
}
