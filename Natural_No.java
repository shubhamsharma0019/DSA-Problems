import java.util.Scanner;

public class Natural_No {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        
        int s = (n+1)*n/2;
        System.out.println("The first n natural numberv sum is :"+s);
    }
    
}

// 1. we take input from user in the form of n.
// 2. second we apply formula direct to calaulate the sum of first n natural numbers. without using loop
// 3. we store sum of first n natural numbers in variable s
// 4. we print s and we take first n natural numbers sum.