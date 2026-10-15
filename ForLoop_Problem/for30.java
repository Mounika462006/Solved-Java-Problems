import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        if(n1%n2 ==0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
