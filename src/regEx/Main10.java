package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main10 {
    public static void main(String[] args) {


       // Pattern pattern= Pattern.compile("bd");// b followed by d
        Pattern pattern= Pattern.compile("[bd]"); // either b or d
        Matcher m= pattern.matcher("abcdbdyzb");
 while (m.find()) {
     System.out.println(m.start() + " " + m.end());
 }

    }
}
