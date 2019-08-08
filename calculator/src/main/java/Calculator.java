/*
Give a string, and implement a calculator to evaluate a simple expression string. The expression string contains only non-negative integers, +, -, * operators.
Example1: input “1+2”, output:3
Example2: input “1+2*5”, output:11
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";
    private static final String ADD = "+";
    private static final String SUBTRACT = "-";

    public static int calculate(String input) {
        System.out.println("Calculating...");
        //break each element in the input and store in list
        Pattern pattern = Pattern.compile("[+-/*]");
        Matcher matcher = pattern.matcher(input);

        //place each element in an order queue
        LinkedList<String> equation = new LinkedList<>();
        int beginIndex = 0;
        boolean matchFound = matcher.find();
        do {
            if (matchFound) { //triggers search
                equation.add(input.substring(beginIndex, matcher.end()-1)); //operand
                equation.add(matcher.group());                              //operator
                beginIndex = matcher.end();
                matchFound = matcher.find();
            }
            if (!matchFound) {
                equation.add(input.substring(beginIndex, input.length())); //closing operand
            }
        } while(matchFound);
        System.out.println(equation);

        //evaluate each match expression
        String[] operator = {MULTIPLY, DIVIDE, ADD, SUBTRACT};
        Arrays.asList(operator).stream().forEach(o -> {
            int index;
            do {
                index = equation.indexOf(o);
                if (index != -1) {
                    int result = evaluateExpression(equation.get(index-1), equation.get(index) ,
                            equation.get(index + 1)); //calculate
                    System.out.println("index: " + index + ",result: " + result);
                    equation.set(index, String.valueOf(result)); //replace into equation
                    equation.remove(index+1);
                    equation.remove(index-1);
                    index = equation.indexOf(o);
                    System.out.println("calculation iteration: " + equation);
                }
            } while (index != -1);
        });
        return Integer.parseInt(equation.pop());
    }

    private static int evaluateExpression(String op1, String operator, String op2) {
        switch (operator) {
            case MULTIPLY: return Integer.parseInt(op1) * Integer.parseInt(op2);
            case DIVIDE : return Integer.parseInt(op1) / Integer.parseInt(op2);
            case ADD : return Integer.parseInt(op1) + Integer.parseInt(op2);
            case SUBTRACT : return Integer.parseInt(op1) - Integer.parseInt(op2);
            default  : return -1;
        }
    }
}
