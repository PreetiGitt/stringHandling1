package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main8 {
    public static void main(String[] args) {
        boolean flag=false;


        Pattern pattern= Pattern.compile("^krishna"); // beginning with krishna
        // matches only with first krishna
        Matcher matcher= pattern.matcher("krishna is supreme power. \nradha krishna is divine chant.\nkrishna resides in Mathura");
        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
      if(!flag)
          System.out.println("Not Found");

    }
}
