package assg;

import java.util.Scanner;

//accept  a word and display the unique characters
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = sc.next();
        char[] arr = s1.toCharArray();
        int len=s1.length();
        boolean b =true;
        for (int i = 0; i < len ; i++) {
            for (int j=0; j < len; j++){
                if(arr[i]==arr[j] && i!=j){
                    b=false;
                    break;
                }
            }
            if(b)
            System.out.println("the unique character in given string is"+ arr[i]);
        }
        }
}
