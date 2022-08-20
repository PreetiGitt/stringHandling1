package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// ^: means at the beginning 
public class Main5 {
    public static void main(String[] args) {
        // beginning(at the 0th index) with d and followed by 2 chars
        Pattern pattern= Pattern.compile("^d.."); //caret symbol
        Matcher matcher= pattern.matcher("This is dfabcg 902");// false
       // Matcher matcher= pattern.matcher("don This is dfabcg  902"); // true
        System.out.println(matcher.find());
    }
}
