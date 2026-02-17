import java.util.Scanner;
public class Basic21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maintance = sc.nextInt();
        int parking = sc.nextInt();
        int hall = sc.nextInt();
        int security = sc.nextInt();
        int electricity = sc.nextInt();
        int cleaning = sc.nextInt();
        int balance = maintance + parking + hall - security - electricity - cleaning;
        System.out.println("Remaining Balance = "+ balance);
    }
}
