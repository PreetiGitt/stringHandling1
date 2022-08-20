package stringBuffer;

public class Main1 {
    public static void main(String[] args) {
        //StringBuffer sb1="abcd"; can not assign ref of String to SB
        StringBuffer sb2=new StringBuffer("Krishna");
       /* System.out.println(sb2);

       System.out.println(sb2.charAt(2));*/
        System.out.println(sb2.length());
        StringBuffer sb3=new StringBuffer("Krishna Radha");
       // System.out.println(sb2.capacity());
       // System.out.println();
        sb2.reverse();
        sb3.reverse();
        /*System.out.println(sb2); //MUTABLE
        System.out.println(sb3);*/
        sb2.append("Radha");// overloaded append
        sb2.append(121004);
        sb2.append(true);
        sb2.append(1.1);
        sb2.append('q');
        class A{}
        sb2.append(new A());
        System.out.println(sb2);
    }
}
