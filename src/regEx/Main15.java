package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main15 {
    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("a");

       Matcher m= pattern.matcher("aaa");


        while(m.find()) {

             System.out.println(m.group()+" "+m.start()+" "+ m.end());
         }
    }
}
