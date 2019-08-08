/*
Give a list of strings, calculate and print the frequency of each string based on alphabetical order.
Example1: input {“abc”, “bcd”, “abc”}, output “abc”|2, “bcd”|1
 */

import java.util.*;

public class WordCounter {

    public static String print(String[] input) {

        Arrays.sort(input);
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();

        Arrays.asList(input).stream().forEach(word ->
            wordCountMap.compute(word, (k,v) -> (v == null) ? 1 : ++v));

        return wordCountMap.entrySet().toString().replace('=', '|' );
    }
}
