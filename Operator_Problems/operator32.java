import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        while(num>0){
            int temp = num %10;
            sum=  sum + temp;
            num/=10;
        }
        System.out.println(sum);
    }
}
