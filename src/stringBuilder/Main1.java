package stringBuilder;

public class Main1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Maths");
        sb.reverse();
        System.out.println(sb);
        StringBuilder sb2=new StringBuilder("Mathematics");
        System.out.println(sb2.length());
        sb2.setLength(7);
        System.out.println(sb2);
        System.out.println(sb2.length());
    }
}
