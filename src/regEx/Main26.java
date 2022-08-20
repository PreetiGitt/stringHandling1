 package regEx;


 import java.util.Scanner;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;

 public class Main26 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("\\b91\\b[6789]\\d {12}" );
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an indian mobile number");
        String num= sc.next();
        Matcher m=p.matcher(num);
        if(m.find())
            System.out.println("You entered the correct number");
            else
            System.out.println("incorrect format");
        }
    }


