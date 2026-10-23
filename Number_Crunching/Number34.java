import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();

        for(long i = start; i<=end;i++){
            long org_num = i;

            long org_sq = i * i;

            long org_rev =0;
            while(org_num>0){
                long temp = org_num %10;
                org_rev = org_rev * 10 + temp;
                org_num /=10;
            }

            long rev_sq = org_rev * org_rev;

            long last_rev = 0;

            while(rev_sq>0){
                long val = rev_sq % 10;
                last_rev = last_rev *10 + val;
                rev_sq/=10;
            }

            if(last_rev == org_sq){
                System.out.print(i +" ");
            }
        }
    }
}
