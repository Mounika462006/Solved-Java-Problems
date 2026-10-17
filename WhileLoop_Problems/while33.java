import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long min =0;
        
        
        for(long i=2;i<=n;i++){
            while(n%i==0){
                if(min<=i){
                    min=i;
                }
                n=n/i;
            }
        }
        System.out.print(min);
        
  }
}
