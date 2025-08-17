import java.util.Scanner;

public class five {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i =1;i<=10;i++){
            int p = n*i;
            System.out.println(n + "*" + i + "=" + p);
        }

    }
    
}
