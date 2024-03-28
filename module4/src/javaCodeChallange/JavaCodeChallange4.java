package javaCodeChallange;

public class JavaCodeChallange4 {
    public static void main(String[] args) {
        // Write  a  Java code  to  check  for  the Prime  numbers between 1-100 .
        System.out.println("Prime numbers between 1 and 100:");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }

        }

    }
}
