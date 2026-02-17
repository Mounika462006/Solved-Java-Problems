import java.util.Scanner;

public class Basic24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int registration = sc.nextInt();
        int broadcast = sc.nextInt();
        int sponsor = sc.nextInt();
        int price = sc.nextInt();
        int rent = sc.nextInt();
        int advertising = sc.nextInt();
        int Remaining = registration + broadcast + sponsor - price - rent - advertising;
        System.out.println("Remaing Tournament Fund = " + Remaining);
    }
}
