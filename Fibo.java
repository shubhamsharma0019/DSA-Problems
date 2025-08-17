import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=1;i<=n;i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
    
}
