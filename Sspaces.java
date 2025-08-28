import java.util.Scanner;

public class Sspaces {
    public static void main(String[] args){
        Scanner  scn = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scn.nextLine();
        
        int count = 0;
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                count++;
            }
        }
        System.out.print("the spaces count is: "+count);

    }
    
}
