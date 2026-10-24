import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();


        for(long i=1; i<=n; i++){
            long check_i =i;
            long org = i;
            long count_i =i;

            int count=0;
            while(count_i>0){
                count++;
                count_i/=10;
            }
            long sum =0; 

            while(org > 0){
                long val =1;
                long temp = org % 10;
                for(int j= 1; j<=count; j++){
                    val = val * temp;
                }
                sum = sum + val;
                count--;
                org/=10;

            }
            if(check_i == sum){
                System.out.print(i + " ");
            }
        }
    }
}
