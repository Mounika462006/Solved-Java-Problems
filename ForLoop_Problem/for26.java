import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();
        long sum = 0;
        for(long i = start; i<=end;i++){
            sum = sum+i;
        }   
        System.out.print(sum);
    }
}
