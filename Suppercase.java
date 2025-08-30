import java.util.Scanner;

public class Suppercase {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scn.nextLine();

        String result = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
              ch = (char)(ch - 32);
            }
            result += ch;

        }
        System.out.println("The uppercaseString is: "+result);

    }
}   

    

