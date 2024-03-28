package javaCodeChallange;

public class JavaCodeChallange6 {
    //Using  Java  Code,  check  for  Anagrams  in  these  strings:
    // "Despite commuting at the peek hour, she was able to keep to time"
    public class AnagramChecker {
        public void main(String[] args) {
            String str1 = "Despite commuting at the peek hour, she was able to keep to time";
            String str2 = "she was able to keep to time Despite commuting at the peek hour";

            if (areAnagrams(str1, str2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }

        public boolean areAnagrams(String str1, String str2) {
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            java.util.Arrays.sort(charArray1);
            java.util.Arrays.sort(charArray2);

            return java.util.Arrays.equals(charArray1, charArray2);
        }
    }

}
