import java.util.Scanner;

public class Reverse_Triangle_Pattern {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = scn.nextInt();
        int nst = 5;
        for(int i=1;i<=n;i++){
            for(int j=nst;j>=1;j--){
                System.out.print("* ");
            }
            nst--;
            System.out.println();
        }
    }
    
}
