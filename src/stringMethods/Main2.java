package stringMethods;

import java.util.Scanner;
//Palindrome
public class Main2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");// scanner is implicitly trimming only leading and trailing spaces
        String str1=sc.next();
        str1=str1.trim();

        System.out.println("length of "+str1 +str1.length());
        String str2="";
        for(int i=str1.length()-1; i>=0;i--){
            str2=str2+ str1.charAt(i);
        }
     /*
      if(str1==str2)
          System.out.println("It is Palindrome");*/
        if(str1.equalsIgnoreCase(str2))
            System.out.println("It is Palindrome");
      else
          System.out.println("Not a Palindrome");
    }

}
