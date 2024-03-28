package javaCodeChallange;

import java.util.Arrays;

public class JavaCodeChallange3 {
    public static void main(String[] args) {
        //Find two numbers of which the product is maximum in an array
        int[] numbers = {3, 5, 4, 8, 10, 12};
        Arrays.sort(numbers);
        int max1 = numbers[numbers.length - 1];
        int max2 = numbers[numbers.length - 2];
        System.out.println("Maximum product: " + (max1 * max2));
    }
}
