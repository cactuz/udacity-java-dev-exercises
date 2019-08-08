/*Complete the “String reverse” coding problem.
Write a function that takes a string as input and returns the string reversed.
Example1: input: "Hello World!", return "!dlroW olleH"
Example2: input: “abcde”, return “edcba”
*/

public class StringChanger {
    public static String reverse(String input) {
        return new StringBuffer(input).reverse().toString();
    }
}
