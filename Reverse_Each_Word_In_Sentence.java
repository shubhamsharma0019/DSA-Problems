import java.util.Scanner;

public class Reverse_Each_Word_In_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String word = "";
        String result = "";

        for (int i = 0; i <= sentence.length(); i++) {
            if (i == sentence.length() || sentence.charAt(i) == ' ') {
                // reverse current word manually
                for (int j = word.length() - 1; j >= 0; j--) {
                    result = result + word.charAt(j);
                }
                // add space if not end of sentence
                if (i != sentence.length()) {
                    result = result + " ";
                }
                // reset word for next
                word = "";
            } else {
                // build the current word
                word = word + sentence.charAt(i);
            }
        }

        System.out.println("Reversed words sentence:");
        System.out.println(result);
    }
}
