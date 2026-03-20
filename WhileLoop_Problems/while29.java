import java.util.Scanner;

public class while29 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum =0;
        int cash = sc.nextInt();

        while (cash !=-1) {
            sum= sum+cash;
            cash = sc.nextInt();
        }
        System.out.println("Total sum: " + sum);
    }
}
