package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//meta Char: []
public class Main4 {
    public static void main(String[] args) {
         // checks if , either e OR t OR y is present
        Pattern pattern= Pattern.compile("[ety]");
      //  Matcher matcher= pattern.matcher("This is defabcg 902");// true
        Matcher matcher= pattern.matcher("This is dfabcg 902");
        System.out.println(matcher.find());
    }
}
