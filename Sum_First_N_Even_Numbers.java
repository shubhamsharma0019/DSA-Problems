import java.util.Scanner;

public class Sum_First_N_Even_Numbers {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = scn.nextInt();
        int count = 0;
        for(int i =1;i<=n;i++){
            if(i%2==0){
                count = count+i;
            }
        }
        System.out.println("The first Even numbers sum is:"+count);
    }
    
}
