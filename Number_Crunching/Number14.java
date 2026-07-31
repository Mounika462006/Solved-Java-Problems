import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long dup = n;
        long rev =0;
        while(dup>0){
            long temp = dup % 10;
            rev = (rev *10) + temp;
            dup = dup/10;
        }
        if(rev == n){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
