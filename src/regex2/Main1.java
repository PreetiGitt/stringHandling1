package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main1 {
    public static void main(String[] args) {
        boolean flag=false;
        Pattern pattern= Pattern.compile("apple|mango");
        Matcher matcher= pattern.matcher("appleand mangoareseasonalfruits apple");
     //   Matcher matcher= pattern.matcher("and areseasonalfruits ");
        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
      if(!flag)
          System.out.println("Not Found");

    }
}
