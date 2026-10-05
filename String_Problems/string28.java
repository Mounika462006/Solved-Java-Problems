import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        s1 = s1+s1;

        if(s1.length() / 2 == s2.length() && s1.contains(s2)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
    }
}
