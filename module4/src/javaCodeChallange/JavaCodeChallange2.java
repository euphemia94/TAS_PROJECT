package javaCodeChallange;

public class JavaCodeChallange2 {
    public static void main(String[] args) {
        //.Reverse the position of words in "I am the best AutomationTester" using recursion:
        String originalString = "I am the best AutomationTester";
        String reversedString = reverseWords(originalString);
        System.out.println(reversedString);
    }

    public static String reverseWords(String sentence) {
        int index = sentence.indexOf(" ");
        if (index == -1) {
            return sentence;
        } else {
            return reverseWords(sentence.substring(index + 1)) + " " + sentence.substring(0, index);
        }

    }
}
