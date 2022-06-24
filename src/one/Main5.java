package one;
class B{

}
class C{
    public String toString(){
        return "Radha";
    }
}
public class Main5 {
    public static void main(String[] args) {
        String str1="krishna";
        String str6="krishna";
        String str2="krish"+"na"; // constant exp evaluated at compile time.
       // System.out.println(str1==str2); //true
        String str3="krish";
        String str4=str3+"na";// exp evaluated at runtime
        System.out.println(str1==str4); //false
        B b1=new B();
        System.out.println(b1);// toString() of object class
        C c1=new C();
        System.out.println(c1);// overidden toString()
        System.out.println("Mango".toString());

    }
}
