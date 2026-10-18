import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        long current = sc.nextLong();
        long replace = sc.nextLong();
        long rev =0;
        long place =1;
        while(n>0){
            long temp = n % 10;
            if(temp == current){
                temp = replace;
            }
            rev = rev + temp*place;
            place = place * 10;

            n=n/10;
        }
        System.out.print(rev);

    }
}
