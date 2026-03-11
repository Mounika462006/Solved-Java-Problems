import java.util.Scanner;

public class while8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        int i = num;
        while(i>0){
            int temp = i%10;
            sum = sum + temp;
            i/=10;
        }
        System.out.println("Number: " + num);
        System.out.println("Sum of digits: " + sum);
    }
}
