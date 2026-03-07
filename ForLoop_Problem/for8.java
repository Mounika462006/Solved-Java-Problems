import java.util.Scanner;

public class for8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dis =0;
        int totalItems =0;
        double orgTotal =0.0;
        double finalTotal = 0.0;

        for(int i =1;i<=n;i++){
            String proName = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            System.out.println("Product: " + proName);
            System.out.printf("Unit Price: $%.1f\n" ,price);
            System.out.println("Quantity: " + quantity);

            if(quantity ==1){
                dis =0;
            }
            else if(quantity >=2 && quantity <=4){
                dis =10;
            }
            else if(quantity >=5 && quantity <= 9){
                dis = 15;
            }
            else if(quantity >=10){
                dis = 20;
            }
            System.out.println("Discount: " + dis +"%");

            double Original = price * quantity;
            double subtotal = Original* (1 - dis /100.0);
            System.out.printf("Subtotal: $%.1f\n",subtotal);

            totalItems += quantity;
            orgTotal += Original;
            finalTotal += subtotal;
            System.out.println();
        }
        double totalDiscount = orgTotal - finalTotal;
        double savings = (totalDiscount / orgTotal )*100;
        System.out.println("Total Items: "+ totalItems);
        System.out.printf("Original Total:$%.1f\n" ,orgTotal);
        System.out.printf("Total Discount: $%.1f\n", totalDiscount);
        System.out.printf("Final Total: $%.1f\n", finalTotal);
        System.out.printf("Savings: %.2f%%\n", savings);


    }
}
