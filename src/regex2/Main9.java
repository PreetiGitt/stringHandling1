package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
match with beginning word in multiple lines given
MultiLine Flag
*/
public class Main9 {
    public static void main(String[] args) {
        boolean flag=false;


        Pattern pattern= Pattern.compile("^krishna",Pattern.MULTILINE); // beginning with krishna in each line

        Matcher matcher= pattern.matcher("krishna is supreme power. \nradha krishna is divine chant.\nkrishna resides in Mathura");
        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
      if(!flag)
          System.out.println("Not Found");

    }
}
