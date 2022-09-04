package regex2;

//labeled loop- can be capital or small
public class Main2 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int i=10;
        int index=0;
        boolean val=false;
    A:
    for (int j=0;j<arr.length;j++){
         if(arr[j]==i) {
             index = j;
             val=true;
             break A; // terminates only from one loop
         }

     }
     if(val){
         System.out.println("Element is present at "+index);
     }
     else
         System.out.println("not present");
    }
}
