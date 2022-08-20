package assg;

import java.util.Scanner;
// reverse order
// accept  a sentence and display the biggest word
//accept  a sentence and display the smallest word
public class Main3 {
    public static int smallestWord(String[] arr){
        int min=0;
        for(int i=0;i< arr.length;i++){
            min=i;
            for(int j=0;j< arr.length;j++){
                if (arr[j].length()<arr[min].length()){
                    min=j;
                }

            }
        }
        return min;
    }
   public static int biggestWord(String[] arr){
        int max=0;
        for(int i=0;i< arr.length;i++){
          max=i;
            for(int j=0;j< arr.length;j++){
                if (arr[j].length()>arr[max].length()){
                         max=j;
                }
            }
        }
    return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String []arr=sc.nextLine().split(" ");
        System.out.println("Largest word in given String is "+ arr[biggestWord(arr)]);
        System.out.println("Smallest word in given String is "+ arr[smallestWord(arr)]);
      //reverse order
        System.out.println("Reverse order is : ");
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
