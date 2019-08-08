/*
Given an unsorted integer array, return the top k larger number in a sorted list. The k is always less than array size. Make sure the time complexity is less than O(nlogn).
Example 1: [-1, 15, 59, 22, 6, 42, 45, 0], k=4, return {22, 42, 45, 59}
Example 2: [5, 10, 22, 100, 8], k=2, return {22, 100}
 */
import java.util.Arrays;

public class NumbersParser {

    public static int[] findLargest(int[] input, int count) {
        Arrays.sort(input);
        System.out.println(input.length);
        System.out.println(Arrays.toString(Arrays.copyOfRange(input, input.length-count, input.length)));
        return Arrays.copyOfRange(input, input.length-count, input.length);
    }
}
