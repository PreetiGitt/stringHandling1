package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// all the words beginning with vowel
public class Main14 {
    public static void main(String[] args) {
// Pattern.CASE_INSENSITIVE= ignores the case

  // Pattern pattern= Pattern.compile("\\b[aeiouAEIOU]");
        Pattern pattern= Pattern.compile("\\b[aeiou]",Pattern.CASE_INSENSITIVE);

       Matcher m= pattern.matcher("once upon a time  Universal mumbai. 15th Aug is Independence day");


        while(m.find()) {

             System.out.println(m.group()+" "+m.start()+" "+ m.end());
         }
    }
}
