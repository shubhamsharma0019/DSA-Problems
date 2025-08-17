import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a  = scn.nextInt();
        int b = scn.nextInt();

        if(a>=b){
            System.out.println(a+ " is greater");
        }else{
            System.out.println(b+ " is greater");
        }
    }
    
}
