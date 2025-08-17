import java.util.Scanner;

public class count {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 0;
        while(n>0){
            int p = n%10;
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
    
}
