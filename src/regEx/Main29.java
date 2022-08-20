 package regEx;


 import java.util.regex.Matcher;
 import java.util.regex.Pattern;

 //
  public class Main29 {
     public static void main(String[] args) {

         Pattern p= Pattern.compile("(radha([Kk]rishna))" );// (grp1(grp2))
         String str="radhaKrishnaradharadhaKrishnaradharadharadha";
         Matcher m=p.matcher(str);
        if (m.find())
            // System.out.println(m.group(1)+" "+m.start(1)+ " "+m.end(1));
         System.out.println(m.group(2)+" "+m.start(2)+ " "+m.end(2));
        // krishna in 2nd() acts as grp 2
         }
     }


