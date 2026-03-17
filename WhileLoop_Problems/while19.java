import java.util.Scanner;

public class while19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Decimal: "+ num);
        int binary =0;
        int place =1;
        
        while (num>0) {
           int value = num % 2;
           binary = binary + (value * place);
           num/=2;
           place*=10;
        }
        System.out.println("Binary: "+ binary);
    }
}
