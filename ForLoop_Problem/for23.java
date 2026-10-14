import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mul =1;
        for(long i=1;i<=n;i++){
            mul *= i;
        }
        System.out.print(mul);
    }
}
