import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int lcm = 1;
        for(int i=1;i<=num2;i++){
            if(num1%i==0  || num2%i==0){
                lcm = lcm * i;
            }
        }
        System.out.println(lcm);
    }
}
