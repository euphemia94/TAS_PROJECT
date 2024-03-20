package task;

public class Task6 {
    public static void main(String[] args) {
        //Write a code to reverse the string DEMOCRACY and get the word COME out of it.
        String word = "DEMOCRACY";
        // to get reverse of DEMOCRACY
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(word);
        reverseString = reverseString.reverse();
        //System.out.println(reverseString);

        //to get come
        String substring = reverseString.substring(4, 8);
        System.out.println( substring);
        //System.out.println(word.substring(startIndex, endIndex));

    }

}
