package regexAssg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// valid emailId
public class Main4 {
    public static void main(String[] args) {
        Pattern pattern= Pattern.compile(".+@([A-Za-z0-9])+\\.([A-Za-z0-9])");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the emailId");
        String str=sc.next();
        Matcher matcher= pattern.matcher(str);
        if(matcher.find())
            System.out.println("Valid ");
        else
            System.out.println("Invalid");
    }
}
