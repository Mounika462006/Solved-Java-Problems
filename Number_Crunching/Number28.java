import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        while(true){
            long n_dup = n;
            long rev =0;
            while(n_dup>0){
                long temp = n_dup%10;
                rev = rev*10 + temp;
                n_dup/=10;
            }
            long add = n + rev;

            long add_dup = add;

            long add_rev=0;

            while(add_dup>0){
                long tem= add_dup % 10;
                add_rev = add_rev *10 + tem;
                add_dup/=10;
            }

            if(add==add_rev){
                System.out.print(add);
                break;
            }
            n= add;

        }
    }
}
