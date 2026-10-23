import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();

        for(long i=start; i<=end;i++){
            long check =i;
            long dup_i =i;
            long sum=0;
            while(dup_i>0){
                long temp = dup_i % 10;
                long mul =1;
                for(long j=temp; j>0;j--){
                        mul = mul * j;
                }
                sum = sum+mul;
                dup_i/=10;
            }
            if(check == sum){
                System.out.print(i+" ");
            }

        }
    }
}
