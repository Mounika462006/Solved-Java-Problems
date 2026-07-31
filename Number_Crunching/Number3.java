import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        long n = sc.nextLong();
        long mul =1;
        while(n>0){
            long temp = n%10;
            mul = mul*temp;
            n=n/10;
        }
        System.out.print(mul);
    }
}
