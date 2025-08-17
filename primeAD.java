import java.util.Scanner;

public class primeAD {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=2;i<=n;i++){
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }  
            }
            if(count==2){
                System.out.print(i+" ");
            }
            count = 0;
        }
    }
    
}
//  Question is print all prime number from 1 to 50
// 1.  firstly we take a input from user to check if a number is a prime number or not prime number so I run a loop from 1 to 50
// 2.  I initialise a variable inside a loop that is count=0;
// 3.  I run another loop after initialise a variable inside a loop and that second loop is also run inside first loop from 1 to i.
// 4.  And I apply logic in second loop i%j==0 this logic give me factor of that number and that logic is Initialise with the help of if statement and in that logic inside if I update count variable if the statement is  correct then count will be updated.
// 5.  We exit the inner loop and we check if count==2 then it is prime number otherwise it is not a prime number and after check this statement we update count variable =0 because it check another number after check this number it is prime or not.

