/*
Give a list of strings, all in lowercase, and all start with an alphabet character, please group them based on their first character.
If the first character is a, group them in a list 0.
If the first character is ‘b’, group them in a list 1; other characters, group them in a list 2.

Example1 : input: {"bcd", "abc", "cde"},
output: [{"abc"}, {"bcd"}, {"cde"}]

Example2: Input: List: {"abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee"}
Output: [{"abc", "ace", "aaaa"}, {"bcd", "bbb", "bbbb"}, {"snb", "eeee"}]
*/

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListGrouperTest {
    @Test
    public void test1(){
        String[] input = new String[]{"bcd", "abc", "cde"};

        List<String> list1 = new ArrayList<>();
        list1.add("abc");

        List<String> list2 = new ArrayList<>();
        list2.add("bcd");

        List<String> list3 = new ArrayList<>();
        list3.add("cde");

        ArrayList<List<String>> expected = new ArrayList<>();
        expected.add(list1);
        expected.add(list2);
        expected.add(list3);

        Assert.assertEquals(expected, ListGrouper.group(input));
    }

    @Test
    public void test2(){
        String[] input = new String[]{"abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbb", "eeee"};

        List<String> list1 = new ArrayList<>();
        list1.add("abc");
        list1.add("ace");
        list1.add("aaaa");

        List<String> list2 = new ArrayList<>();
        list2.add("bcd");
        list2.add("bbb");
        list2.add("bbbb");

        List<String> list3 = new ArrayList<>();
        list3.add("snb");
        list3.add("eeee");

        ArrayList<List<String>> expected = new ArrayList<>();
        expected.add(list1);
        expected.add(list2);
        expected.add(list3);

        Assert.assertEquals(expected, ListGrouper.group(input));
    }
}
