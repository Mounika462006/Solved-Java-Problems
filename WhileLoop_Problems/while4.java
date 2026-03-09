import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1;
        int i=n;
        while (i>0) {
            fact = fact *i;
            i--;
        }
        System.out.println("Factorial of " + n + " = " + fact);

    }
}
