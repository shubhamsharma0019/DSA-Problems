import java.util.Scanner;

public class AcountPN {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = scn.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the values in array:");
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int positive = 0;
        int negative = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                positive++;
            }else if(arr[i]<0){
                negative++;
            }else{
                System.out.println("nothing");
            }
        }
        System.out.println("The positive number in an array is:"+positive);
        System.out.println("The negative number in an array is:"+negative);
    }
    
}
