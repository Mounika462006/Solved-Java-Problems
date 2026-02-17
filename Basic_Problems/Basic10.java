import java.util.Scanner;

public class Basic10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int delivery = sc.nextInt();
        int payout = sc.nextInt();
        int incentive = sc.nextInt();
        int fuel = sc.nextInt();
        int net = (delivery * payout ) + incentive - fuel;
        System.out.println("Driver Earnings = "+ net);
    }
}
