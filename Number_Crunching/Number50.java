import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long right = n % 10;
        n=n/10;

        long current = n % 10;
        n=n/10;

        int count=0;
        while(n>0){
            long left = n%10;
            if(current > left && current > right){
                count++;
            }
            
            right = current;
            current = left;
            n=n/10;
        }
        System.out.print(count);
        
    }
}
