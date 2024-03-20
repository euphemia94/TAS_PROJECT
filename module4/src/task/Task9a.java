package task;

public class Task9a {
    public static void main(String[] args) {
        //I have a list of numbers, 1-10, write a loop that prints odd if it is an odd
        // number and a loop that prints even if it is an even number
        //to print odd number in a loop
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
