import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev =0;
        while(temp>0){
             int rem = temp %10;
             int sum = 2 + rem;
             if(sum >= 10){
                  sum = sum%10;
             }
             rev = (rev *10) + sum;
            temp = temp/10;
            
        }
        int val =0;
        
        while(rev>0){
            int dig = rev % 10;
            val =(val * 10) + dig;
            rev/=10;
        }

        System.out.println(val);
    }
}
