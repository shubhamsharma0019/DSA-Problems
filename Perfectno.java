import java.util.Scanner;

public class Perfectno {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();
        int value = n;
        int count = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                count  = count +i;
            }
        }
        if(count==value){
            System.out.println("This is perfectnumber:");
        }else{
            System.out.println("this is not perfect number"); 
        }
    }
    
}
