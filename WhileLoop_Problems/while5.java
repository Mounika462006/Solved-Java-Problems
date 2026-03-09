import java.util.Scanner;

public class while5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Original: " + n);
        int i = n;
        int rev = 0;
        while (i>0) {
            int temp = i%10;
            rev = ( rev * 10 ) + temp;
            i/=10;
        }
        System.out.println("Reversed: " + rev);
    }
}
