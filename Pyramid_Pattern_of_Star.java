import java.util.Scanner;

public class Pyramid_Pattern_of_Star {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = scn.nextInt();
        int nsp = n-1;
        int nst = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*");
            }
            nsp = nsp-1;
            nst = nst+2;
            System.out.println();
        }
    }
    
}
