import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        long n = sc.nextLong();
        long org =n;
        long n1 =n;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        long sum =0;
        while(n1>0){
            long temp = n1 % 10;
            
            long val =1;
            for(int i=1 ; i<=count; i++){
                val = val * temp;
            }
            sum = sum + val;
            count--;
            n1/=10;
        }
        if(sum == org){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
