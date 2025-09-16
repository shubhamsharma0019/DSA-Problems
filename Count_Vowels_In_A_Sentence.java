import java.util.Scanner;

public class Count_Vowels_In_A_Sentence {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = scn.nextLine();

        char [] arr = str.toCharArray();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(arr[i]=='a' || arr[i] == 'i' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u'){
                count++;
            }
        }
        System.out.println("The count of vowels is:"+count);
    }
    
}
