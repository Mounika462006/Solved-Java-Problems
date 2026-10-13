import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int add = num +8;
        int div = add /3;
        double mod = div % 5;
        double mul = mod * 5;
        System.out.printf("%.6f",mul);
    }
}
