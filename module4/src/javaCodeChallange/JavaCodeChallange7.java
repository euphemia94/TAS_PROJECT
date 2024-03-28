package javaCodeChallange;

public class JavaCodeChallange7 {
    //7.Reverse "TestifyAutomation" using recursion in Java
    public static void main(String[] args) {
        String str = "TestifyAutomation";
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        // Base case: If the string is empty or has only one character, return the string itself
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Recursive step: Swap the first and last characters and reverse the substring in between
        return reverseString(str.substring(1)) + str.charAt(0);
    }

}
