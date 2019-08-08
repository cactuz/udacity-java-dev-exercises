/*
Complete find the first duplicate character in a string.
Write a method. Give a string, find the first duplicate character, return the index. If there is no duplicate character, return -1.
Example1: input: abcabc, return: 3
Example2: input: abcd, return: -1
 */

import org.junit.Assert;
import org.junit.Test;

public class DuplicateFinderTest {
    @Test
    public void test1(){
        Assert.assertEquals(3, DuplicateFinder.findDuplicateIndex("abcabc"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(-1, DuplicateFinder.findDuplicateIndex("abcd"));
    }

}
