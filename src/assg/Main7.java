package assg;

import java.util.Scanner;

//accept  a sentence and display the total number of words
/*
accept  a sentence and a word display the location of the word in the sentence
 otherwise display suitable message
*/
public class Main7 {
   static int wordLocation(String str, char ch){
        int i=0;
        boolean flag=false;
        while(i<str.length())
        {
            if(str.charAt(i)==ch){
                flag =true;
                     break;
                           }
            else{
                i++;
            }
        }
        if(flag)
        return i;
        else
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = sc.nextLine();
        char[] arr = s1.toCharArray();
        System.out.println("Enter a character to be located");
        char ch=sc.next().charAt(0);
        int len=s1.length();
        int count=0;
        for (int i = 0; i < len ; i++) {
            if(s1.charAt(i)!=' '){
                count++;
            }

        }
        System.out.println("Total number of words in sentence is :" +count);
        //2nd issue
      int val=  wordLocation(s1,ch);
      if(val==-1)
          System.out.println("No such character in Sentence");
      else
          System.out.println("Location of given char in sentence "+val);
        }
}
