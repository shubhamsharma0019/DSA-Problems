import java.util.Scanner;

public class Areverse {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n = scn.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the values in array: ");

        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[]){
        int sp =0;
        int ep = arr.length-1;
        while(sp<ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }

    }
    
}
