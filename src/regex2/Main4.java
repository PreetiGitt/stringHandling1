package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main4 {
    public static void main(String[] args) {
        boolean flag=false;
       // Pattern pattern= Pattern.compile("\\b.\\b");
        Pattern pattern= Pattern.compile("\\."); // checks for .
        Matcher matcher= pattern.matcher("a.b.c%#$^");
        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
      if(!flag)
          System.out.println("Not Found");

    }
}
