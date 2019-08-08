import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelOnly {

    public static String find(String input) {
        Pattern pattern = Pattern.compile("[a-zA-Z&&[aeiouAEIOU]]");
        Matcher matcher = pattern.matcher(input);

        StringBuilder output = new StringBuilder();
        while (matcher.find()) {
            output.append(matcher.group());
        }

        return output.toString();
    }

}
