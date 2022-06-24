package one;

public class Main3 {
    public static void main(String[] args) {
       System.out.println("Krishna"=="Krishna");
        String str1= "Krishna";// str1 stores the ref of value("Krishna") in SCP
        String str2="Krishna"; //str2 stores the same ref of same value("Krishna") in SCP
        System.out.println(str1==str2);//true

        String str3=new String("Krishna");
        System.out.println(str1==str3);//false
        String str4= str3.intern(); // intern() checks and returns the ref from SCP
        System.out.println(str1==str4);
       /* String str5=new String("Krishna");
        System.out.println(str3==str5);*/

    }
}
