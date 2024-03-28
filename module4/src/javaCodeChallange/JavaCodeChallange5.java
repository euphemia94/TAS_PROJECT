package javaCodeChallange;

import java.util.*;

public class JavaCodeChallange5 {
    public static void main(String[] args) {
        // Create anagram buckets from a given input array of words:
        // input is {"akka", "akak", "baab", "baba", "bbaa"}
            String[] input = {"akka", "akak", "baab", "baba", "bbaa"};
            Map<String, List<String>> buckets = createAnagramBuckets(input);

            // Print anagram buckets
            for (List<String> bucket : buckets.values()) {
                System.out.println(bucket);
            }
        }

        public static Map<String, List<String>> createAnagramBuckets(String[] words) {
            Map<String, List<String>> buckets = new HashMap<>();

            for (String word : words) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sortedWord = new String(chars);

                // If bucket does not exist, create a new one
                if (!buckets.containsKey(sortedWord)) {
                    buckets.put(sortedWord, new ArrayList<>());
                }

                // Add word to the bucket
                buckets.get(sortedWord).add(word);
            }

            return buckets;
        }

}
