import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0;
        int b =1;
        for(int i=0; i<n;i++){
             int c = a+b;
            a = b;
            b = c;
        }
        int val = a %100;
        System.out.print("The last two digit of " + n +"th Fibonacci number is " +val);
    }
}
