import java.util.Scanner;

public class Sconsonant {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int count = 0;
        str = str.toLowerCase();
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch != 'a' && ch !='e' && ch != 'i' && ch != 'o' && ch != 'u'){
                count++;
            }
        }
        System.out.print(count);
    }
    
}
