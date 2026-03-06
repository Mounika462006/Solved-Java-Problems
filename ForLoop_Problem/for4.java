import java.util.Scanner;

public class for4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int commissionRate = 0;
        double bonus = 0.0;
        double totalSales = 0.0;
        double totalCommission = 0.0;

        double highestSales = 0;
        String topPerformer = "";

        for (int i = 1; i <= n; i++) {

            String repName = sc.next();
            double salesAmount = sc.nextDouble();

            System.out.println("Sales Rep: " + repName);
            System.out.printf("Sales Amount: $%.1f\n", salesAmount);

            if (salesAmount <= 40000) {
                commissionRate = 5;
            } 
            else if (salesAmount <= 80000) {
                commissionRate = 8;
            } 
            else if (salesAmount <= 100000) {
                commissionRate = 10;
            } 
            else if (salesAmount <= 150000) {
                commissionRate = 12;
            } 
            else {
                commissionRate = 15;
            }

            System.out.println("Commission Rate: " + commissionRate + "%");

            double commissionEarned = salesAmount * commissionRate / 100;
            System.out.printf("Commission Earned: $%.1f\n", commissionEarned);

            if (salesAmount >= 150000) {
                bonus = 3000;
            } 
            else if (salesAmount >= 100000) {
                bonus = 2000;
            } 
            else {
                bonus = 0;
            }

            System.out.printf("Bonus: $%.1f\n", bonus);

            double totalPayout = commissionEarned + bonus;
            System.out.printf("Total Payout: $%.1f\n", totalPayout);
            System.out.println();

            totalSales += salesAmount;
            totalCommission += commissionEarned;

            if (salesAmount > highestSales) {
                highestSales = salesAmount;
                topPerformer = repName;
            }
        }

        System.out.println("Total Sales Reps: " + n);
        System.out.printf("Total Sales: $%.1f\n", totalSales);
        System.out.printf("Total Commissions: $%.1f\n", totalCommission);
        System.out.println("Top Performer: " + topPerformer);
    }
}