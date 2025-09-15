import java.util.Scanner;

public class Check_Two_String_Are_Anagram {
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First String:");
        String str = scn.nextLine();
        System.out.print("Enter Second String:");
        String ptr = scn.nextLine();

        if(str.length() != ptr.length()){
            return;
        }

        char [] arr1 = str.toCharArray();
        char [] arr2 = ptr.toCharArray();
        int count = 0;
        for(int i=0;i<arr1.length;i++){
            char ch1 = arr1[i];
            for(int j=0;j<arr2.length;j++){
                char ch2 = arr2[j];
                if(ch1==ch2){
                    count++;
                }
            }
        }
        
        if(count == arr1.length){
            System.out.print("Both Strings are Anagram");
        }else{
            System.out.println("Both Strings Are Not Anagram");
        }
    }
    
}
