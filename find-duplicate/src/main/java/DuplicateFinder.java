/*
Complete find the first duplicate character in a string.
Write a method. Give a string, find the first duplicate character, return the index. If there is no duplicate character, return -1.
Example1: input: abcabc, return: 3
Example2: input: abcd, return: -1
 */

public class DuplicateFinder {

    public static int findDuplicateIndex(String input) {
        int idx = -1;
        int inputSize = input.length();
        for (int i = 0; i < inputSize-1; i++) {
            int searchResult = input.indexOf(input.charAt(i), i+1 );
            if ( searchResult != -1);
                return searchResult;
        }
        return idx;
    }
}
