package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Possessive Quantifiers
public class Main17 {
    public static void main(String[] args) {
        boolean flag=false;

        Pattern pattern= Pattern.compile(".*+abc"); // .*+ consumed everything including abc
           Matcher matcher= pattern.matcher("appleabcamazonabc");

        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
        if(!flag)
            System.out.println("Not Found");

    }


    }

