package javaCodeChallange;

import java.util.Arrays;

public class JavaCodeChallange8 {
    //Given a collection of 1 million integers,all ranging between1 to 9,
    // sort them in Big O(n) time
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5, 6, 7, 9, 8, 4, 2, 1, 3, 5, 6, 7, 9, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void countingSort(int[] arr) {
        int[] count = new int[10]; // Count array to store frequencies of each element e

        // Count frequencies
        for (int num : arr) {
            count[num]++;
        }

        // Fill the original array with sorted elements
        int index = 0;
        for (int i = 1; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}
