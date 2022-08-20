 package regEx;


 import java.util.Scanner;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;

 public class Main27 {
    public static void main(String[] args) {
       // Pattern p= Pattern.compile("radharadharadha" );
      //  Pattern p= Pattern.compile("radha{3}" );// radh.. followed by 3 a
        Pattern p= Pattern.compile("(radha){3}" ); // anything in () becomes a group
        String str="radha Krishnaradha radhaKrishna radharadharadha";
        Matcher m=p.matcher(str);
        if(m.find())
            System.out.println(m.group()+" "+m.start()+ " "+m.end());
            else
            System.out.println("did not find");
        }
    }


