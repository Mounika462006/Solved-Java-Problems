import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long rev =0;
        while(n>0){
            long temp = n % 10;
            rev = (rev *10) + temp;
            n/=10;
        }
        System.out.print(rev);
    }
}
