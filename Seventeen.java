import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
         int num = scn.nextInt();
        
          int sum = 0;
          while(num>0){
            int p = num%10;
            sum = sum + p;
            num = num/10; 
          }
        
      
         System.out.println(sum);

       
        
        
       
            
        
       
    }
    
}
