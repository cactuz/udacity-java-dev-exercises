/*
Given an unsorted integer array, return the top k larger number in a sorted list. The k is always less than array size. Make sure the time complexity is less than O(nlogn).
Example 1: [-1, 15, 59, 22, 6, 42, 45, 0], k=4, return {22, 42, 45, 59}
Example 2: [5, 10, 22, 100, 8], k=2, return {22, 100}
 */
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class NumbersParserTest {

    @Test
    public void test1(){
        int[] input = {-1, 15, 59, 22, 6, 42, 45, 0};
        int count = 4;
        int[] expected = {22, 42, 45, 59};

        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(NumbersParser.findLargest(input, count)));
    }

    @Test
    public void test2(){
        int[] input = {5, 10, 22, 100, 8};
        int count = 2;
        int[] expected = {22, 100};

        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(NumbersParser.findLargest(input, count)));
    }
}
