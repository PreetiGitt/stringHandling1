package stringBuffer;

public class Main3 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Krishna");
        sb.insert(2,'u'); // add u at 2nd index
        sb.insert(2,true);
        sb.insert(6,10);
        sb.insert(0, 2.0);
        System.out.println(sb);
    }
}
