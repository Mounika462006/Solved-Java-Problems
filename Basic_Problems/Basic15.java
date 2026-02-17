import java.util.Scanner;

public class Basic15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        int price = sc.nextInt();
        int service = sc.nextInt();
        int commission = sc.nextInt();
        int revenue = ( room * price ) + service - commission;
        System.out.println("Total Revenue = " + revenue);
    }
}
