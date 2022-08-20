package stringMethods;

public class Main3 {
    public static void main(String[] args) {
        String sentence="Honesty is best policy";
        String []words=sentence.split(" ");// split() returns an array
        for(String word: words){
            System.out.println(word);
        }
    }
}
