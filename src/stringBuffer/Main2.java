package stringBuffer;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuffer sb1=new StringBuffer(str);
        StringBuffer sb2=sb1.reverse();
        System.out.println(sb2);
        if(sb1.equals(sb2)){
            System.out.println("String is palindrome");
        }
        else
            System.out.println("Not a Palindrome");

    }
}
