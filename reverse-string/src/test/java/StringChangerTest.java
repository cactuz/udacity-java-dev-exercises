/*Complete the “String reverse” coding problem.
Write a function that takes a string as input and returns the string reversed.
Example1: input: "Hello World!", return "!dlroW olleH"
Example2: input: “abcde”, return “edcba”
*/

import org.junit.Assert;
import org.junit.Test;

public class StringChangerTest {

    @Test
    public void test1(){
        String input = "Hello World!";
        String expected = "!dlroW olleH";

        Assert.assertEquals(expected, StringChanger.reverse(input));
    }

    @Test
    public void test2(){
        String input = "abcde";
        String expected = "edcba";

        Assert.assertEquals(expected, StringChanger.reverse(input));
    }
}
