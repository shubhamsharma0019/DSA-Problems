import java.util.Scanner;

public class Acounteven {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scn.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the values in array: ");

        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("the count of even number in array is: "+ count);
    }
    
}
