import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int choice = sc.nextInt();
        
        long odd =0;
        long even =0;
        
        while(n!=0){
            long temp = n%10;
            
            if(temp%2==0){
                even = (even * 10) + temp;
            }
            else if(temp %2==1){
                odd = (odd *10 ) + temp;
            }
            n= n/10;
        }
        
       
        long rev_even =0;
        while(even!=0){
            long temp = even%10;
            rev_even = (rev_even *10) + temp;
            even = even/10;
            
        }
         long rev_odd=0;
        while(odd!=0){
            long temp = odd%10;
            rev_odd = (rev_odd *10) + temp;
            odd = odd/10;
            
        }
        if(choice == 0){
                if(rev_odd != 0)
                    System.out.print(rev_odd);
                if(rev_even != 0)
                     System.out.print(rev_even);
        }
        else{

            if(rev_even != 0)
                 System.out.print(rev_even);

             if(rev_odd != 0)
                  System.out.print(rev_odd);
        }
        
    }
}
