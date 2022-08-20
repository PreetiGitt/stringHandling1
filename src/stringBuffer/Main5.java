package stringBuffer;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
       /* StringBuffer sb=new StringBuffer("Mathematics");
        sb.delete(3,7);// starting from 3, deleting till 7-1
        //System.out.println(sb);
        StringBuffer sb1=new StringBuffer("Mathematics");
        sb1.replace(3,7,"akshay");
        System.out.println(sb1);
        StringBuffer sb2=new StringBuffer("Mathematics");
        sb2.replace(3,7,"abc");
        System.out.println(sb2);*/
        String str="Once upon a time in mumbai";
      String str2=  str.replace("Once","");
       // System.out.println(str2);
        StringBuffer sb3=new StringBuffer("Once upon a time in mumbai");
        String word="mumbai";
       int start= sb3.indexOf(word);
       int end=start+ word.length();
        sb3.replace(start,end,"");
        System.out.println(sb3);


    }
}
