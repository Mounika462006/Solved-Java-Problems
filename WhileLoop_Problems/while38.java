import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long  start = sc.nextLong();
        long end = sc.nextLong();
        
        for(long i=start+1; i<=end;i++){
            long sum=0;
            long mul =1;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    sum= sum+j;
                    mul = mul *j;
                }
                
            }
            if(mul%sum==0){
                System.out.print(i +" ");
            }
        }
    }
}
