import java.util.Scanner;
public class Main {

    public static void main(String[] Strings) {
        Scanner sc= new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double room = (l * w) /9;
        System.out.printf("%.2f",room);

    }
}
