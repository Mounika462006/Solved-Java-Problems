import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long rev=0;
        while(n>0){
            long temp = n%10;
            rev = rev*10 + temp;
            n=n/10;
        }
        while(rev>0){
            if(rev>=10){
                long div = rev %100;
                System.out.print(div);
            }
            else{
                long div1 = rev%10;
                System.out.print(div1);

            }
            rev= rev/100;
        }

    }
}
