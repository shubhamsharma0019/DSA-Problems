import java.util.Scanner;

public class Amin {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = scn.nextInt();
        System.out.println("Enter the Array Elements:");
        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<=min){
                min = arr[i];
            }
        }
        System.out.println("This is the minimum value in whole the arrayis : "+min);
    }
    
}
