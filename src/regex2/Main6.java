package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main6 {
    public static void main(String[] args) {
        boolean flag=false;


        Pattern pattern= Pattern.compile("[ab]",Pattern.LITERAL);
       // Matcher matcher= pattern.matcher("a.b.c%#$^"); DOES NOT MATCH
        Matcher matcher= pattern.matcher("bcdd[ab].c%#$^");
        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
      if(!flag)
          System.out.println("Not Found");

    }
}
