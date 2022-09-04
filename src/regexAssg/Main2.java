package regexAssg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// valid date(dd-mm-yyyy)
public class Main2 {
    public static void main(String[] args) {
        Pattern pattern= Pattern.compile("(0?[1-9]|[[0-9]12]|3[012])[-/](0?[1-9]|1[012])[-/]((19|20)\\d\\d)|[1-9]\\d");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date");
        String str=sc.next();
        Matcher matcher= pattern.matcher(str);
        if(matcher.find())
            System.out.println("Valid date");
        else
            System.out.println("Invalid date");
    }
}
