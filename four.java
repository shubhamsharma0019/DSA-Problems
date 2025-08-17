import java.util.Scanner;

public class four {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=10;i>=n;i--){
            System.out.print(i+" ");
        }
    }
    
}
