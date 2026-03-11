import java.util.Scanner;

public class while10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i =0;
        int a=0;
        int b=1;
        while (i<num) {
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
            c = a;
            i++;
        }
    }
}
