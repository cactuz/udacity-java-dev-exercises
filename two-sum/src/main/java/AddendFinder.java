/*
Complete the “two sum” coding problem.
Given an integer array, return true if two numbers in this array can be summed to target.
Example1: input[1, 2, 3, 4], target:5, return true
Example2: input[1,4,5,1,6], target 12, return false
 */

import java.util.Arrays;

public class AddendFinder {

    public static boolean find(int[] input, int target) {
        Arrays.sort(input);

        int arraySize = input.length;
        if (arraySize == 0 || arraySize == 1) {
            return false;

        }
        if (input[0] >= target) {
            return false;
        }

        for(int i=0; i < arraySize; i++) {
            int pair = target - input[i];
            if (Arrays.binarySearch(input, i+1, arraySize, pair) >= i ) {
                return true;
            }
        }

        return false;
    }
}
