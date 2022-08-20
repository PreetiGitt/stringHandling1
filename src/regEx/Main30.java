 package regEx;


 import java.util.regex.Matcher;
 import java.util.regex.Pattern;

 //Back reference
 public class Main30 {
     public static void main(String[] args) {

         // same digits occuring in grp1

         //Pattern p= Pattern.compile("(\\d\\d)\\1" );
         Pattern p= Pattern.compile("(\\d\\d)\\1" );
         String str="12334345767979";
         Matcher m=p.matcher(str);
        while (m.find())
             System.out.println(m.group()+" "+m.start()+ " "+m.end());

         }
     }


