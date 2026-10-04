import java.util.*;
public class Main{
    public static void isPalindrome(String a){
        String rev ="";

        for(int i= a.length()-1; i>=0; i--){
            rev = rev + a.charAt(i);
        }
        if(a.equals(rev)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        isPalindrome(s);
    }
}
