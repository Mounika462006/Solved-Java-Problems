import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();

        for(long i=start; i<=end;i++){
            long org = i;
            long sq = i;
            long count=0;
            while(org>0){
                long temp =  org %10;
                count++;
                org/=10;
            }
            long space =1;
            for(int j=1;j<=count;j++){
                space = space *10;
            }
            long  org_sq = sq * sq;

            long split = org_sq % space;
            long  rem = org_sq / space;
            long sum = split + rem;

            if(sum==sq){
                System.out.print(i+" ");
            }
        }
    }
}
