package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Greedy Quantifiers(*)
public class Main14 {
    public static void main(String[] args) {
        boolean flag=false;
// max numbers of chars followed by abc
           Pattern pattern= Pattern.compile(".*abc");
        //Pattern pattern= Pattern.compile(".*abc.*");
        Matcher matcher= pattern.matcher("appleabcamazonabc");
        //Matcher matcher= pattern.matcher("abc");
        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
        if(!flag)
            System.out.println("Not Found");

    }


    }

