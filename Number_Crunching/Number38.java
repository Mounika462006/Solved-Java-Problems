import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        int base1 = sc.nextInt();
        int base2 = sc.nextInt();
        int change_base = sc.nextInt();

        long sum1 =0;
        long pow1=0;
        while(num1>0){
            long temp = num1 % 10;
            long val = temp * (int) Math.pow(base1, pow1);
            sum1 = sum1 + val;
            pow1++;
            num1/=10;
        }

        long sum2=0;
        long pow2=0;
         while(num2>0){
            long temp = num2 % 10;
            long val = temp * (int) Math.pow(base2, pow2);
            sum2 = sum2 + val;
            pow2++;
            num2/=10;
        }
        long add= sum1 + sum2;
        String rev =" ";
        while(add>0){
            long temp = add % change_base;
            rev = temp + rev;
            add= add/change_base;
        }
        System.out.print(rev);

    }
}
