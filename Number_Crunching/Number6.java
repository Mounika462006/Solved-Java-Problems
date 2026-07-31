import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        long n = sc.nextLong();
        long max=0;
        while(n>0){
            long temp = n%10;
            if(max < temp){
                max = temp;
            }
            n=n/10;
        }
        System.out.print(max);
    }
}
