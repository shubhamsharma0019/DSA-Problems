import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=1;i<=n;i++){
            int p = i*i*i;
            System.out.println(p);
        }
    }
    
}
