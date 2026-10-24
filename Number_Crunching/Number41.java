import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        boolean val = false;
        if(n1.length() == n2.length()){
            String check = n1 + n1;
            if(check.contains(n2)){
                val = true;
            }
        }
       if(val){
        System.out.print("Yes");
       }
       else{
        System.out.print("No");
       }
        
    }
}
