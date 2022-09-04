package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//
public class Main13 {
    public static void main(String[] args) {
        boolean flag=false;
// a not followed by d, shows only a as group,
            Pattern pattern= Pattern.compile("a(?!d)");
        Matcher matcher= pattern.matcher("appleRadhaKrishnaDivinityamazon");

        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
        if(!flag)
            System.out.println("Not Found");

    }


    }

