package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// atleast 1 or more
public class Main21 {
    public static void main(String[] args) {

      //  Pattern pattern= Pattern.compile("[0-9]");
       // Pattern pattern= Pattern.compile("[0-9]+");// taking the digits as group
        //Pattern pattern= Pattern.compile("[0-9]{3,}"); // at least 3 or more
     //  Pattern pattern= Pattern.compile("[0-9]{5}"); // exactly 5 digit
      //  Pattern pattern= Pattern.compile("[0-9]{3,4}");// min 3 and max 4 digits at one place

      //  Pattern pattern= Pattern.compile("\\d ");
      //  Matcher m= pattern.matcher("29ab345cd6786efg");
       Pattern pattern= Pattern.compile("\\d+{3,4}");
      //  Pattern pattern= Pattern.compile("\\d+");
        Matcher m= pattern.matcher("29ab345cd67865efg4567hi");
        while(m.find()) {

             System.out.println(m.group()+" "+m.start()+" "+ m.end());
         }
    }
}
