package stringMethods;

public class Main6 {
    public static void main(String[] args) {
        char[] arr={'a','b','c','d'};
        String str=new String(arr);
        String str2=new String(arr,2,1);// starting from 2nd index n then number of chars
        System.out.println("Str2 is " +str2);
        System.out.println(str);
            System.out.println(arr);

    }
}
