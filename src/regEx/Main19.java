package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// a* = not a or 1/more than 1 as a group
public class Main19 {
    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("a*");// 0 or more
      //  Pattern pattern= Pattern.compile("a?");
      // Matcher m= pattern.matcher("bcad");
        Matcher m= pattern.matcher("bcaaaaaad");

        while(m.find()) {

             System.out.println(m.group()+" "+m.start()+" "+ m.end());
         }
    }
}
