package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// atleast 1 or more
public class Main20 {
    public static void main(String[] args) {

    /*    Pattern pattern= Pattern.compile("a+");
        Matcher m= pattern.matcher("abcaaaaaad");*/

        /*Pattern pattern= Pattern.compile("a?");
        Matcher m= pattern.matcher("abcaaaaaad");*/

        Pattern pattern= Pattern.compile("a*");
        Matcher m= pattern.matcher("abcaaaaaad");
        while(m.find()) {

             System.out.println(m.group()+" "+m.start()+" "+ m.end());
         }
    }
}
