package assg;
/* accept  a sentence and display the words in dictionary order
 */
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s1=sc.next();
        char[] arr=s1.toCharArray();

        for(int i=0;i<s1.length()-1;i++){
                 int min=i;
            for(int j=i+1;j<s1.length();j++){
               if(arr[j]<arr[min])

                   min=j;
            }
            char temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;



        }

        for (char ch:arr){
            System.out.print(ch);
        }
    }


}
