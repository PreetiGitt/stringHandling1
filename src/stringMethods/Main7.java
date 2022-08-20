package stringMethods;

public class Main7 {
    public static void main(String[] args) {
        byte[] arr={97,98,99, 100, 101};
        String str=new String(arr);
        System.out.println(str);
        String str2=new String(arr,1,2);
        System.out.println(str2);
    }
}
