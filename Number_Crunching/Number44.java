import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean check = true;
        while(n>0){
            long rem = n %10;
            long  quo = n /10;
            while(quo > 0){
                long val = quo % 10;
                if(val == rem){
                    check = false;
                    break;
                }
                quo = quo/10;
            }
            n=n/10;
        }
        if(check){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
