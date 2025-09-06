import java.util.Scanner;

public class Aprime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scn.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the values in array:");
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int countprime = 0;
        int count = 0;
        for(int i=0;i<n;i++){
           for(int j=1;j<=max;j++){
            if(arr[i]%j==0){
                count++;
            }
           }
           if(count==2){
            countprime++;
           }
            count =0;
        }
       
        System.out.println("The prime number in array is: "+countprime);
       


    }
    
}
