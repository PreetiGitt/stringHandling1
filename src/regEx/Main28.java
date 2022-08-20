 package regEx;


 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
// finding radhakrishna
 public class Main28 {
    public static void main(String[] args) {

       /* Pattern p= Pattern.compile("(radha){3}" ); // anything in () becomes a group
        String str="radhaKrishnaradharadhaKrishnaradharadharadha";*/

        Pattern p= Pattern.compile("(radha([Kk]rishna))" ); // anything in () becomes a group
        String str="radhaKrishnaradharadhaKrishnaradharadharadha";
        Matcher m=p.matcher(str);
        while(m.find())
            System.out.println(m.group()+" "+m.start()+ " "+m.end());

        }
    }


