import java.util.Scanner;

public class Missing_Number_In_A_Sequence {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int N = scn.nextInt();
        int arr[] = new int[N];
        System.out.print("Enter numbers");
        for(int i=0;i<N;i++){
            arr[i] = scn.nextInt();
        }

        int n = N+1;
        int totalsum = n*(n+1)/2;

        int actualsum = 0;
        for(int i=0;i<N;i++){
            actualsum += arr[i];
        }

        int missing = totalsum-actualsum;

        System.out.println("missing number in  a sequence: "+missing);
    }
    
}
