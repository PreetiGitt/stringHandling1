package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//EXCLUSION
public class Main11 {
    public static void main(String[] args) {
        boolean flag=false;


        Pattern pattern= Pattern.compile("[^iahr]"); // excluding the given chars

        Matcher matcher= pattern.matcher("krishna");

        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
        if(!flag)
            System.out.println("Not Found");

    }


    }

