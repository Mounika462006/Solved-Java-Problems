import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end  = sc.nextLong();
        long str = start;
        

        for(long i=str; i<=end; i++){
            long dup_i = i;
            long count_i = i;
                                                                  
            int count =0;
            while(count_i >0){
                count++;
                count_i /= 10;
            }

            int first =1;
            for(int l=1; l<count; l++){
                first = first * 10;
            }

            boolean check = true;
            for(int k =0; k<count;k++){
                boolean prime = true;

                if(dup_i < 2){
                    prime = false;
                }
                else{
                    for(long j = 2; j * j <= dup_i; j++){
                        if(dup_i % j == 0){
                        prime = false;
                        break;
                    }

                }
                if(!prime){
                   check = false;
                   break;
                }
            }       
                long rem = dup_i % 10;
                long quo = dup_i /10;
                long rev = (rem * first) + quo;
                dup_i = rev;
            }
            if(check){
                System.out.print(i+" ");
            }
        }
    }
}
