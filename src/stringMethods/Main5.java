package stringMethods;

import java.nio.charset.StandardCharsets;

public class Main5 {
    public static void main(String[] args) {
        String str="abcd";
        byte [] arr=str.getBytes();
        for (byte b: arr) {
            System.out.println(b); //printing the ASCII codes
        }


    }
}
