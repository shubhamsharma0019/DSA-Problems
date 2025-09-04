import java.util.Scanner;

public class ScountCh {
   public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String str = scn.nextLine();

    System.out.println("Enter a character to count: ");
    char ch = scn.next().charAt(0);

    int count = 0;

    for(int i=0;i<str.length();i++){ 
        if(str.charAt(i)== ch){
            count++;
        }
    }
    System.out.println("Character appears "+ count +" times.");
   }
}
