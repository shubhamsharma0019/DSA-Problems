import java.util.Scanner;

public class Sum_Of_First_N_Odd_Numbers {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number");
        int n = scn.nextInt();

        int count = 0;
        for(int i =0;i<=n;i++){
            if(i%2 != 0){
                count =  count+i;
            }
        }
        System.out.println("The first n odd numbers sum is:"+count);
    }
    
}
