import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum =0;
        for(long i =1;i<=n;i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
        
        for(long i = sum+1; i>0; i++){
            long count =0;
            for(int j=1 ;j<=i; j++){
                if(i%j==0){
                count++;
                }
            }
            if(count ==2){
                System.out.print(i);
                break;
            }
            
        }
        
        
        
    }
}
