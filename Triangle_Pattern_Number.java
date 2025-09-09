import java.util.Scanner;

public class Triangle_Pattern_Number {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = scn.nextInt();   
        int nst = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print(j+" ");
            }
            nst++;
            System.out.println();
        } 
    }
    
}
