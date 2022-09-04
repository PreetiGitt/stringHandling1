package regexAssg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// valid Indian Phone number
public class Main1 {
    public static void main(String[] args) {
        Pattern pattern= Pattern.compile("^(91-)[6789]([0-9]{9}$)");
        Matcher matcher= pattern.matcher("91-72918469022");
        if(matcher.find())
            System.out.println("Valid number");
        else
            System.out.println("Invalid number");
    }
}
