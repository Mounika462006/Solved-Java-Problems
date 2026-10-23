import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();

        for(long i=start; i<=end;i++){
            long count_dup =i;
            long dup=i;
            long org=i;
            
            long count=0;

            while(count_dup>0){
                long temp = count_dup % 10;
                count++;
                count_dup/=10;
            }
           
            long sum=0;
            while(dup>0){
                long mul=1;
                long last = dup % 10;
                for(long j=1; j<=count;j++){
                    mul= mul*last;                                                           
                }
                sum = sum+mul;
                dup/=10;
            }
            if(sum==org){
                System.out.print(org+" ");
            }
        }
    }
}
