import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long first = n/100000;
        long last = n%100000;
        System.out.print(last+" "+first);
        
    }
}
