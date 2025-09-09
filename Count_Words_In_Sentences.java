import java.util.Scanner;

public class Count_Words_In_Sentences {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Write sentence: ");
        String str = scn.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                count++;
            }
            
        }
        System.out.println("count is:"+count);
    }
    
}
