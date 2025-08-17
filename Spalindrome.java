import java.util.Scanner;

public class Spalindrome {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String mtr = reverse(str);
        if(str.equals( mtr)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    public static String reverse(String str){
        char[] arr = str.toCharArray();
        int sp = 0;
        int ep = arr.length-1;
        while(sp<ep){
            char temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
        return new String(arr);
    }
    
}
