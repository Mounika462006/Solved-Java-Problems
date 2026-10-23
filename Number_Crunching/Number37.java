import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner  sc= new Scanner(System.in);
        long n = sc.nextLong();
        int base = sc.nextInt();
        long org = n;
        int count =0;
        while(n>0){
            long temp = n % 10;
            count++;
            n/=10;
        }
        long sum =0;
        long pow =0;
        while(org>0){
            long temp = org % 10;
                long val = temp * (int) Math.pow(base,pow);
                sum = sum + val;
                pow++;
            org = org/10;
        }
        System.out.print(sum);
        
    }
}
