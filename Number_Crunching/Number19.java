import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long org = n;
        long rev1 = 0;
        long rev2 =0; 
        while(n>0){
            long temp = n%10;
            
            if(temp % 2==0){
                rev1 = (rev1*10) + temp;
            }
            else if(temp % 2==1){
                rev2 = (rev2*10) + temp;
            }
            n= n/10;
        }
        long odd =0;
        while(rev2 >0){
            long temp = rev2 %10;
            odd = (odd *10) + temp;
            rev2 /=10;
        }
         long even =0;
        while(rev1 >0){
            long temp = rev1 %10;
            even = (even *10) + temp;
            rev1 /=10;
        }
        if(odd >0){
            System.out.print(odd);
        }
        if(even >0){
          System.out.print(even);
        }
        if(org%10==0){
            System.out.print("0");
        }
    }
}
