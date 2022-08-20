package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
      //  Pattern pattern= Pattern.compile("abc ");// space after abc
        Pattern pattern= Pattern.compile("abc");
        Matcher matcher= pattern.matcher("This is defabcg 902");
        System.out.println(matcher.find()); // false for line8
    }
}
