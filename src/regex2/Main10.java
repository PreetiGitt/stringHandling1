package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Matcher.matches()-- true if, and only if,
 the entire region sequence matches this matcher's pattern
*/
public class Main10 {
    public static void main(String[] args) {
        boolean flag=false;


        Pattern pattern= Pattern.compile("^krishna$"); // beginning with krishna

        Matcher matcher= pattern.matcher("krishna");
        System.out.println( matcher.matches());

        if(matcher.find()) {
            System.out.println("matched");

        }


    }
}
