import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            double baseCost= sc.nextDouble();
            double extraGB=sc.nextDouble();
            double ratePerGB=sc.nextDouble();
            double tax=sc.nextDouble();

            double mul=extraGB*ratePerGB;
            double total=baseCost+mul;
            double end=total+(total*tax/100);
            System.out.printf("Total Bill = %.2f", end);
    }
}