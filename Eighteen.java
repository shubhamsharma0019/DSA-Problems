import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = n;
        int p = 0;
        while(n>0){
           int c = n%10;
            p = p*10+c;
            n = n / 10;
        }
        if(x==p){
            System.out.print("palindrome no");
        }else{
              System.out.print(" not palindrome");
        }

    }
    
}
