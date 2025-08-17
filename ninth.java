import java.util.Scanner;

public class ninth {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n>0){
            System.out.println("positive");
        }else if(n<0){
            System.out.println("negative");
        }else if(n==0){
            System.out.println("zero");
        }else{
            System.out.println("This is not a number");
        }

    }
    
}
