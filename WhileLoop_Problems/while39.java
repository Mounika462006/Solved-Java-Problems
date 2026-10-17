import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum=0;
        for(long i =1;i<=n;i++){
            if(n%i==0){
                sum = sum+i;
            }
            
            
        }
       
       long val = n;
       while(val<=sum){
           val = val + n;
       }
        System.out.print(val);
        
    }
}
