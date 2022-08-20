package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        Pattern pattern= Pattern.compile("abc"); // "abc" is a regEx
       // Matcher matcher= pattern.matcher("Defabcgh");
        Matcher matcher= pattern.matcher("Defgh");
        System.out.println(matcher.find());// true for line9
    }
}
