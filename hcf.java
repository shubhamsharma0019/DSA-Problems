import java.util.Scanner;

public class hcf {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = 1;
        
        int max = Math.max(num1,num2);
        for(int i=1;i<=max;i++){
            if(num1%i==0 && num2%i==0){
                hcf = i;
            }
        }
        System.out.println("Hcf of " + num1 + " and " + num2 + " is " + " : "+hcf);
       
     }
}
