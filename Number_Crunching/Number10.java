import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long last = n%10;
        
        while(n>=10){
             n=n / 10;
        }
        
        long first = n;
        System.out.print(n + " "+ last);
    }
}
