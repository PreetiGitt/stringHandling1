package regexAssg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// valid Password (min 8 char, mx 15; at least one special char, One lower and upper case )
public class Main3 {
    public static void main(String[] args) {
       // Pattern pattern= Pattern.compile("([\\d]+[a-z]+[A-Z]+[!@$^&*+()]+){8,15}");
        Pattern pattern= Pattern.compile("([\\da-zA-Z!@$^&*+()]+){8,15}");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Password");
        String str=sc.next();
        Matcher matcher= pattern.matcher(str);
        if(matcher.find())
            System.out.println("Valid ");
        else
            System.out.println("Invalid");
    }
}
