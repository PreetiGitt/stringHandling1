package one;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s1=sc.next();
       // s1=s1.intern();
        String s2="krishna";
        System.out.println(s1==s2);//false on  prompting same value

    }
}
