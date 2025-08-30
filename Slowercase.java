import java.util.Scanner;

public class Slowercase {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scn.nextLine();

        String result = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >='A' && ch <= 'Z'){
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        System.out.println("The lowercase String is: "+result);

    }
    
}
