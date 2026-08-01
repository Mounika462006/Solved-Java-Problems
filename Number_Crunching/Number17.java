import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long org = n;
        long sum =0;
        while(n!=0){
            long temp = n%10;
            long mul =1;
            for(long i =temp ;i>0;i--){
                mul = mul *i;
            }
            sum = sum+mul;
            n = n/10;
        }
        if(org == sum){
            System.out.print("Yes");
        }
        else{
             System.out.print("No");
        }
    }
}
