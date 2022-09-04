package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern.LITERAL-- treating as normal not special char
public class Main5 {
    public static void main(String[] args) {
        boolean flag=false;

        Pattern pattern= Pattern.compile(".",Pattern.LITERAL);
        Matcher matcher= pattern.matcher("a.b.c%#$^");
        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
      if(!flag)
          System.out.println("Not Found");

    }
}
