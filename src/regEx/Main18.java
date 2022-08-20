package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Quantifiers- allow us to specify the no. of occurrences to match against
public class Main18 {
    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("a?");// 0 or 1== a or not a

       Matcher m= pattern.matcher("bcad"); // zero length match at the end
       //Matcher m= pattern.matcher("");

        while(m.find()) {

             System.out.println(m.group()+" "+m.start()+" "+ m.end());
         }
    }
}
