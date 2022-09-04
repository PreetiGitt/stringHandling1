package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Multiple Flags with + symbol
public class Main7 {
    public static void main(String[] args) {
        boolean flag=false;


      //  Pattern pattern= Pattern.compile("[ab]",Pattern.LITERAL);
        //Matcher matcher= pattern.matcher("bcdd[ab].c%#[ab]$^");
        Pattern pattern= Pattern.compile("[ab]",Pattern.LITERAL+Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher("bcdd[ab].c%#[AB]$^");
        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
      if(!flag)
          System.out.println("Not Found");

    }
}
