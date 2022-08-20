package assg;

import java.util.Scanner;

// accept  a word and display whether it is palindrome or not
public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s1=sc.next();
        char[] arr=s1.toCharArray();
        boolean b=true;
          int i=0, j= arr.length-1;
          while(i<j)
          {
              if(arr[i]!=arr[j] ) {
                  if (arr[j]-arr[i]!=32)
                      b = false;
              }
              i++;
              j--;
          }
          if(b)
              System.out.println("String is palindrome" );
          else
              System.out.println("Not a palindrome");
    }
}
