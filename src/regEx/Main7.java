package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main7 {
    public static void main(String[] args) {
      //  Pattern pattern= Pattern.compile("[b][d]");
      /*  Pattern pattern= Pattern.compile("[b]");
        Matcher m= pattern.matcher("abcd");// true for only 'b'*/

        Pattern pattern= Pattern.compile("bd");// b followed by d
        Matcher m= pattern.matcher("abcdbdyz");
        System.out.println(m.find());
        System.out.println(m.start()+" "+ m.end());// end gives +1 value


    }
}
