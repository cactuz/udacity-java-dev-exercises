/*
Given a non-negative integer n, print the number in words.
Example1:
    Input: 10245
    Output: "ten thousand two hundred forty five"
Example2:
    Input: 125
    Output: "one hundred twenty five"
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumbersReaderTest {

    NumbersReader numbersReader;

    @Before
    public void before() {
        numbersReader = new NumbersReader();
    }

    @Test
    public void test1(){
        long input = 10245;
        String expected = "ten thousand two hundred forty five";

        Assert.assertEquals(expected, numbersReader.toWords(input));
    }

    @Test
    public void test2(){
        long input = 125;
        String expected = "one hundred twenty five";

        Assert.assertEquals(expected, numbersReader.toWords(input));
    }

    @Test
    public void test3(){
        long input = 123456789;
        String expected = "one hundred twenty three million four hundred fifty six thousand seven" +
                " hundred" +
                " eighty nine";

        Assert.assertEquals(expected, numbersReader.toWords(input));
    }

}
