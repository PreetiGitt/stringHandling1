package stringBuffer;

public class Main4 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("maths");

        System.out.println("Length of the String is: "+sb.length());

        System.out.println("Capacity of the String is: "+sb.capacity());// capacity=Length+16
        sb.append("Physics");
        System.out.println("Length of the String is: "+sb.length());
        System.out.println("Capacity of the String is: "+sb.capacity());
        sb.append("Chemistry");
        System.out.println("Length of the String is: "+sb.length());
        System.out.println("Capacity of the String is: "+sb.capacity());
        //Capacity doesn't increase till it is full
        // thereafter-> ( currentCapacity+1)*2
        sb.append("apple");
        System.out.println("Length of the String is: "+sb.length());
        System.out.println("Capacity of the String is: "+sb.capacity());
    }
}
