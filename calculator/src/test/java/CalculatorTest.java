/*
Give a string, and implement a calculator to evaluate a simple expression string. The expression string contains only non-negative integers, +, -, * operators.
Example1: input “1+2”, output:3
Example2: input “1+2*5”, output:11
 */

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void test1(){
        String input = "1+2";
        int expected = 3;

        Assert.assertEquals(expected, Calculator.calculate(input));
    }

    @Test
    public void test2(){
        String input = "1+2*5";
        int expected = 11;

        Assert.assertEquals(expected, Calculator.calculate(input));
    }

    @Test
    public void test3(){
        String input = "100-1000-10001";
        int expected = -9901;

        Assert.assertEquals(expected, Calculator.calculate(input));
    }

}

