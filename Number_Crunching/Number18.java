import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long org = n;
        long sum =0;
        while(n!=0){
            long temp = n%10;
            sum = sum+temp;
            n = n/10;
        }
        
        if(org % sum==0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
