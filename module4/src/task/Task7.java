package task;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        //create a two dimensional array with 4 rows and 3 columns.
        // Fill only the first column with any fruits of ur choice
        String[] []   fruitsArray = new String[4] [3];
        // Fill the first column with fruits
        fruitsArray[0][0] = "Apple";
        fruitsArray[1][0] = "Banana";
        fruitsArray[2][0] = "Orange";
        fruitsArray[3][0] = "Grapes";
        System.out.println(Arrays.deepToString(fruitsArray));



    }
}
