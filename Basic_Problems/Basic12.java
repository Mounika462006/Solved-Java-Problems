import java.util.Scanner;

public class Basic12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int ticket = sc.nextInt();
        int snack = sc.nextInt();
        int maintance = sc.nextInt();
        int electricity = sc.nextInt();

        int profit = ticket + snack - maintance - electricity;
        System.out.println("Net Profit = "+ profit);
    }
}
