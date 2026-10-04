import java.util.*;
public class Main{
    public static void strReverse(String a){
        String rev ="";
        for(int i=a.length()-1; i>=0; i--){
            rev = rev + a.charAt(i);
        }
        System.out.print(rev);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        strReverse(s);
    }
}
