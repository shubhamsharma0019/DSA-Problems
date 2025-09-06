import java.util.*;

public class Armstrong {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();
        int r = n;
        int temp = n;
        int count = 0;
        while(temp>0){
            count++;
            temp = temp/10;
        } 
        temp = n;
        int pownum = 0;
        while(temp>0){
            int p = temp%10;
            p =(int) Math.pow(p, count);
            pownum = pownum + p;
            temp = temp/10;
        }  
        if(r==pownum){
            System.out.println("This is a armstrong number: "+r);
        }else{
            System.out.println("This is not armstrong number");
        }
    }
    
}
