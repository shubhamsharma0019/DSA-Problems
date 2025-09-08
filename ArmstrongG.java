import java.util.Scanner;

public class ArmstrongG {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scn.nextInt();
        int totalcount = 0;
        for(int i=1;i<=n;i++){
            int value = i;
            int temp = i;
            int count = 0;
            while(temp>0){
                count++;
                temp = temp/10;
            }
            temp = value;
            int pownum = 0;
            while(temp>0){
                int digit = temp % 10;
                pownum =pownum + (int) Math.pow(digit,count);
                temp = temp/10;
            }
            if(value==pownum){
                System.out.println(value);
                totalcount++;
            }
        }
        System.out.println("total armstrong numbers between 1 and" + n + " = " +totalcount);
    }
    
}
