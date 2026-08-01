import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long remove = n % 10000000000l;
        
        long last = remove % 100000;
        
        long first = remove / 100000;
        System.out.print(last);
        System.out.print(first);
        
        
    }
} 
