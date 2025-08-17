import java.util.Scanner;

public class largestno {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scn.nextInt();
        if(n<0){
            n = n*-1;
        }

        int max = 0;
        while(n>0){
            int p = n%10;
            if(p>max){
                max = p;
            }
            n = n/10;
        }
        System.out.print(max);
    }
    
}
