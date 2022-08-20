package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main9 {
    public static void main(String[] args) {


        Pattern pattern= Pattern.compile("b");// b followed by d
        Matcher m= pattern.matcher("abcdbdyzb");



       // System.out.println(m.start()+" "+ m.end());


    }
}
