package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Not Followed
public class Main12 {
    public static void main(String[] args) {
        boolean flag=false;

// excluding a followed by d
        Pattern pattern= Pattern.compile("a[^d]");

           // Pattern pattern= Pattern.compile("a[^dD]");

       // Pattern pattern= Pattern.compile("a[^(Krishn)]");
        Matcher matcher= pattern.matcher("appleRadhaKrishnaDivinityamazon");

        while(matcher.find()) {
            System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
            flag=true;
        }
        if(!flag)
            System.out.println("Not Found");

    }


    }

