 package regEx;


public class Main24 {
    public static void main(String[] args) {
     String [] words= "There    was a king       with the name            Prithviraj".split("\\s+");
        for (String word: words)
            System.out.println(word);

         }
    }

