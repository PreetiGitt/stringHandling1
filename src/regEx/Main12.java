package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// all the words beginning with vowel
public class Main12 {
    public static void main(String[] args) {

        /* '\b' is backspace,
        *   '\\b'== word boundary
        *
        * */

        //Pattern pattern= Pattern.compile("^[aeiou]");
       // Pattern pattern= Pattern.compile("\b[aeiou]\b");

     //   Pattern pattern= Pattern.compile("^o");


        //Pattern pattern= Pattern.compile("\\bt"); // word starting with t
        //Pattern pattern= Pattern.compile("\ba\b");
     //   Pattern pattern= Pattern.compile("\\btime\\b");// finding the word time
      //  Pattern pattern= Pattern.compile("\\bu");  // beginning with u
   Pattern pattern= Pattern.compile("\\b[aeiou]");

      //  Pattern pattern= Pattern.compile("e$"); //checking for the whole sentence: False
       // Pattern pattern= Pattern.compile("e\\b");
       Matcher m= pattern.matcher("once upon a time  universal mumbai");


        while(m.find()) {
             System.out.println(m.start()+" "+ m.end());
         }
    }
}
