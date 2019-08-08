/*
Give a list of strings, calculate and print the frequency of each string based on alphabetical order.
Example1: input {“abc”, “bcd”, “abc”}, output “abc”|2, “bcd”|1
 */

import org.junit.Assert;
import org.junit.Test;

public class WordCounterTest {
    @Test
    public void test1(){
        String[] input = {"abc", "bcd", "abc"};
        String expected = "[abc|2, bcd|1]";

        Assert.assertEquals(expected, WordCounter.print(input));
    }
}
