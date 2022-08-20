package assg;

import java.util.Scanner;

// accept  a word and display the frequency of characters

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = sc.next();
       // char[] arr = s1.toCharArray();

        int len=s1.length();
        int []arr1=new int[len];

        for (int i = 0; i < len ; i++) {
            int freq=1;
            for (int j = i+1; j < len; j++) {
                if(s1.charAt(i)==s1.charAt(j)){
                   freq++;
               }
            }
            System.out.println("Frequency of "+ s1.charAt(i)+ " is:" +freq);
        }


    }
}