package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main11 {
    public static void main(String[] args) {


       // Pattern pattern= Pattern.compile("^b");// b at beginning
        Pattern pattern= Pattern.compile("b$"); // b at last
       // Matcher m= pattern.matcher("abcdbdyzb");
       Matcher m= pattern.matcher("bcdbdyzb");
       // Matcher m= pattern.matcher("abcdbdyz");

        System.out.println(m.find());
    }
}
