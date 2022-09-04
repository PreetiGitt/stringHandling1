package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Reluctant Quantifiers
public class Main15 {
    public static void main(String[] args) {
        boolean flag=false;
// min numbers of chars followed by abc
           Pattern pattern= Pattern.compile(".*?abc");
           Matcher matcher= pattern.matcher("appleabcamazonabc");

        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
        if(!flag)
            System.out.println("Not Found");

    }


    }

