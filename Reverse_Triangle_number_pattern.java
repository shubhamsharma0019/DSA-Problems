import java.util.Scanner;

public class Reverse_Triangle_number_pattern {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = scn.nextInt();
        int nst = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print(j+" ");
            }
            nst--;
            System.out.println();
        }

    }
    
}
