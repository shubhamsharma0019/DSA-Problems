import java.util.Scanner;

public class Perfect_Two {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scn.nextInt();
        int countplus = 0;
        for(int i=1;i<=n;i++){
            int value = i;
            int count = 0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    count = count + j;
                }
            }
            if(count==value){
                System.out.println(value);
                countplus++;
            }
            count=0;
        }
        System.out.println("the total armstrong numbers is:"+countplus);
    }
    
}

// 1. Firstly We take an input a number by through user
// 2. second step we take one variable with value zero. in this variable we take all the perfect numbers and print lastly.
// 3. third we run the loop from 1 to n.
// 4. we take two variable first is to store original value of of i,because if I did not store that value it is missing/other variable is for calculate for count factor of that number to find is that number is perfect number or not perfect number.
// 5. we run loop for 1 to i to calculate the factors and add those factors inside loop and calculate that number is perfect number or not perfect number.
// 6. Inside outer loop we check condition by through if statement comparison between value variable and count if both are similar then update the countplus variable and count should be zero because we chech another number is perfect number or noy perfect number.
// 7. After all this we print countplus and we get all thew numbers that is perfect number or not  perfect numbers between 1 to 1000/n.

