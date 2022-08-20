 package regEx;


public class Main25 {
    public static void main(String[] args) {
        String result = "9871119912abc9876543211def7289176111".replaceAll("[0-9]{10}", "#");
        System.out.println(result);
    }
}

