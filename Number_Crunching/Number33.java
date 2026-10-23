import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long start = sc.nextLong();
        long end = sc.nextLong();

        for(long i= start; i<=end; i++){
            long dup_i = i;
            while(dup_i != 1 && dup_i !=4){
                long sum=0;
                while(dup_i>0){
                    long temp = dup_i % 10;
                    long sq = temp * temp;
                    sum = sum+sq;
                    dup_i/=10;
                }
            dup_i = sum;
            }
            if(dup_i ==1){
                System.out.print(i +" ");
            }
           
        }
    }
}
