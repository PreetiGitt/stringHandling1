package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// ^: means at the beginning
// . : is meta char, to match with any char
// [] : is also a meta char
public class Main6 {
    public static void main(String[] args) {
        Pattern pattern= Pattern.compile("[0-9][0-9][0-9]");
       Matcher matcher= pattern.matcher("don 78903 This 567  is dfabc87690g  902 ");
    /* //  Matcher matcher= pattern.matcher("don  This 567  is dfabc87690g  902 ");
        Matcher matcher= pattern.matcher("don  This is dfabc87690g  902 ");*/

        while(matcher.find()){
            System.out.println(matcher.start()+" "+ matcher.end());
        }
         String str="word".replaceAll("o.","ab");
        System.out.println(str);


    }
}
