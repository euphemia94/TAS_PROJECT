package javaCodeChallange;

public class JavaCodeChallange1 {
    public static void main(String[] args) {
        // Write  Java  code  to  check  if  race car  and  10801  is  a palindromes.

            String firstStr = "race car";
            String  secStr = "10801";

            if (isPalindrome(firstStr)) {
                System.out.println(firstStr + " is a palindrome.");
            } else {
                System.out.println(firstStr + " is not a palindrome.");
            }

            if (isPalindrome(secStr)) {
                System.out.println(secStr + " is a palindrome.");
            } else {
                System.out.println(secStr + " is not a palindrome.");
            }
        }

    private static boolean isPalindrome(String firstStr) {
        return false;
    }


}

