import java.util.Scanner;

public class Amax {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n = scn.nextInt();
         System.out.println("Enter values  in Array: ");
        int []arr = new int [n];

        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>=max){
              max = arr[i];
            }
        }
        System.out.println("Max Element in Array is:"+max);

    }
    
}
