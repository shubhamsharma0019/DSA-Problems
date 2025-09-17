import java.util.Scanner;

public class Solving_Is_Prime_Optimal {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        if(N==1){
            System.out.print("neither prime nor composite");
            return;
        }
        int count =0;
        for(int i=1;i*i<=N;i++){
            if(N%i==0){
                if(i==N/i){
                    count=count+1;
                }else{
                    count=count+2;
                }
            }  
        }
        if(count==2){
          System.out.print("prime number");
        }else{
          System.out.print("not prime number");
        }
    }
     
    
}
