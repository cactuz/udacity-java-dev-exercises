/*
Give a list of strings, all in lowercase, and all start with an alphabet character, please group them based on their first character.
If the first character is a, group them in a list 0.
If the first character is ‘b’, group them in a list 1; other characters, group them in a list 2.

Example1 : input: {“bcd”, “abc”, “cde”},
output: [{“abc”}, {“bcd”}, {“cde”}]

Example2: Input: List: {“abc”, “bcd”, “bbb”, “ace”, “snb”, “aaaa”, “bbbbb”, “eeee”}
Output: [{“abc”, “ace”, “aaaa”}, {“bcd”, “bbb”, “bbbb”}, {“snb”, “eeee”}]
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListGrouper {

    public static List<List<String>> group(String[] input) {

        System.out.println("Starting...");
        //transform input into a hashmap of words with the first char as the key
        HashMap<Character, List<String>> workingMap = new HashMap<>();
        Arrays.asList(input).stream().forEach(word -> {
            //set the key
            Character key = word.charAt(0);
            if (!key.equals('a') && !key.equals('b')) {
                key = 'x';
            }

            //check if there is an existing entry for that key, otherwise create new
            List list = new ArrayList();
            if (workingMap.containsKey(key)) {
                list = workingMap.get(key);
            } else {
                list = new ArrayList();
            }
            list.add(word);

            //add to map
            workingMap.put(key, list);
            System.out.println("workingMap.size: " + workingMap.size());
        });

        List<List<String>> output = new ArrayList<>();
        workingMap.forEach((key, list) -> {
            System.out.println("adding to output: " + list);
            output.add(list);}
        );

        return output;
    }
}
