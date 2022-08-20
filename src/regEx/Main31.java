 package regEx;


 import java.util.regex.Matcher;
 import java.util.regex.Pattern;

 //Back reference
 public class Main31 {
     public static void main(String[] args) {

         // same digits occuring in grp1

         //Pattern p= Pattern.compile("(\\d\\d)\\1" );
         Pattern p= Pattern.compile("(\\d\\d([abc]))\\2" );
       //  String str="1233434aac5767979";
         String str="1233434adc5767979";
         Matcher m=p.matcher(str);
        while (m.find())
             System.out.println(m.group()+" "+m.start()+ " "+m.end());

         }
     }


