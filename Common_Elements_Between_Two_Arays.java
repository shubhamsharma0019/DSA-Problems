import java.util.Scanner;

public class Common_Elements_Between_Two_Arays {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n1 = scn.nextInt();
        int [] arr1 = new int[n1];

        for(int i=0;i<n1;i++){
            arr1[i] = scn.nextInt();
        }

        System.out.println("Enter the size of second array:");
        int n2 = scn.nextInt();
        int [] arr2 = new int[n2];

        for(int i=0;i<n2;i++){
            arr2[i] = scn.nextInt();
        }
        
        for(int j=0;j<arr1.length;j++){
            int arr = arr1[j];
            for(int k=0;k<arr2.length;k++){
                if(arr==arr2[k]){
                     System.out.print("Common Elements Between Two Arrays: "+ arr);
                }
            }
        }
       

    }
    
}
