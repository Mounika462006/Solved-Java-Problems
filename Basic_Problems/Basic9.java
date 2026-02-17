import java.util.Scanner;

public class Basic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int room= sc.nextInt();
        int days =sc.nextInt();
        int medicine = sc.nextInt();
        int lab=sc.nextInt();
        int insurance = sc.nextInt();

        int bill= (room * days) + medicine + lab - insurance;
        System.out.println("Payable Amount = "+ bill);
    }
}
