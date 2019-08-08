/*
Given a non-negative integer n, print the number in words.
Example1:
    Input: 10245
    Output: "ten thousand two hundred forty five"
Example2:
    Input: 125
    Output: "one hundred twenty five"
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;

public class NumbersReader {

    FileReader filereader;
    BufferedReader bufferedReader;
    HashMap<Integer, String> literalMap = new HashMap<>();
    HashMap<Integer, String> incrementsMap = new HashMap<>();

    public String toWords(long input) {
        try {
            filereader = new FileReader("resources/literals.csv");
            bufferedReader = new BufferedReader(filereader);
            String literals;
            do {
                literals = bufferedReader.readLine();
                if (literals != null)
                    literalMap.put(Integer.parseInt(literals.split(",")[0]),
                            literals.split(",")[1]);
            } while (literals != null);

            filereader = new FileReader("resources/increments.csv");
            bufferedReader = new BufferedReader(filereader);
            do {
                literals = bufferedReader.readLine();
                if (literals != null)
                    incrementsMap.put(Integer.parseInt(literals.split(",")[0]),
                            literals.split(",")[1]);
            } while (literals != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "Internal error. Mapping file not found.";
        } catch (IOException e) {
            e.printStackTrace();
            return "Internal error. Mapping file reading error.";
        }

        if (input > 999999999999999999L) {
            return "Valid input only up to 999,999,999,999,999";
        } else {
            StringBuffer in = new StringBuffer(String.valueOf(input)).reverse();
            ArrayList<String> words = new ArrayList<>();
            int num, numNext, counter = 0, hundred=0;

            for (int i = 0; i < in.length(); ++i) {
                num = Integer.parseInt(String.valueOf(in.charAt(i)));
                hundred++;

                if (i % 3 == 0) {
                    if (counter > 0) {
                        words.add(0, incrementsMap.get(counter));
                    }
                    counter++;
                    if (i != in.length() - 1) {
                        numNext = Integer.parseInt(String.valueOf(in.charAt(i + 1)));
                        if (numNext == 1) {
                            words.add(0, literalMap.get(10 + num));
                            ++i;
                            continue;
                        }
                    }
                    words.add(0, literalMap.get(num));
                } else {
                    if (hundred == 3) {
                        words.add(0, "hundred");
                        hundred = 0;
                        words.add(0, literalMap.get(num));
                    } else if (hundred == 2) {
                        words.add(0, literalMap.get(num*10));
                    } else {
                        words.add(0, literalMap.get(num));
                    }
                }
            }

            StringBuffer output = new StringBuffer();
            words.forEach(w -> output.append(w + " "));
            return output.toString().trim();
        }
    }

    public static void main(String[] args) {
    }
}




