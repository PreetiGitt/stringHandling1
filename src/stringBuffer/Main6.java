package stringBuffer;

public class Main6 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Maths");
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.setCharAt(2,'g');
        System.out.println(sb);
    }
}
