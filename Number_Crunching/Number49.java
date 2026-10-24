import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long n1 =n;
        long rev =0;
        while(n>0){
            long temp = n % 10;
            if(temp % 2==1){
                rev =rev*10 + temp;
            }
            n=n/10;
        }

        long val = 0;
        while(n1>0){
            long temp = n1 % 10;
            if(temp % 2==0){
                val = val * 10 + temp;
            }
            else if(temp % 2==1){
                    long add = rev % 10;
                    val =val*10 + add;
                    rev = rev /10;

            }
            n1 /=10;
        }
        long last =0;
        while(val>0){
            long temp = val % 10;
            last = last * 10 + temp;
            val/=10;
        }
        System.out.print(last);
    }
}
