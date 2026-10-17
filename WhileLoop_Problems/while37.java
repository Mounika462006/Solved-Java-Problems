import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();
        long n= sc.nextLong();
        
        for(long i =start; i<=end; i++){
            long count =0;
            for(long j=1; j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(n < count){
                System.out.print(i);
                break;
            }
        }
    }
}
