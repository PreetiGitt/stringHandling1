package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//  escape sequence '\'
public class Main13 {
    public static void main(String[] args) {
      //  System.out.println("\"Apple\"");

       // System.out.println("Apple\b"); // backspace
        //System.out.println("Apple"+"\");-->ERROR
        System.out.println("Apple\\");
    }
}
