/*
Complete the “two sum” coding problem.
Given an integer array, return true if two numbers in this array can be summed to target.
Example1: input[1, 2, 3, 4], target:5, return true
Example2: input[1,4,5,1,6], target 12, return false
 */

import org.junit.Assert;
import org.junit.Test;

public class AddendFinderTest {

    @Test
    public void test1(){
        int[] input = {1,2,4,3};
        int target = 5;

        Assert.assertTrue(AddendFinder.find(input, target));
    }

    @Test
    public void test2(){
        int[] input = {1,4,5,1,6};
        int target = 12;

        Assert.assertFalse(AddendFinder.find(input, target));
    }
}
