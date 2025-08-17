import java.util.Scanner;

public class smallestno {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n<0){
            n = n * -1;
        }

        int min = 1;
        while(n>0){
            int p = n%10;
            if(p<min){
                min = p;
            }
            n = n/10;
        }
        System.out.println(min);

    }
    
}
