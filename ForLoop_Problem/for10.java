import java.util.Scanner;

public class for10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double subtotal = 0.0;
        int value = 0;

        for(int i = 1; i <= n; i++){

            String itemName = sc.next();
            double price = sc.nextDouble();
            int qty = sc.nextInt();

            double itemSubtotal = price * qty;

            System.out.println("Item: " + itemName);
            System.out.println("Price: $" + price + " x " + qty);
            System.out.println("Subtotal: $" + itemSubtotal);
            System.out.println();

            subtotal += itemSubtotal;
            value += qty;
        }

        System.out.println("Total Items: " + value);
        System.out.println("Subtotal: $" + subtotal);

        double tax = subtotal * 0.08;
        System.out.println("Tax (8%): $" + tax);

        double service = subtotal * 0.10;
        System.out.println("Service Charge (10%): $" + service);

        double grandTotal = subtotal + tax + service;
        System.out.println("Grand Total: $" + grandTotal);
    }
}