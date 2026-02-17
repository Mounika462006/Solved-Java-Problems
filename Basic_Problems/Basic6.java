import java.util.Scanner;


public class Basic6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int distance = sc.nextInt();
        int mileage=sc.nextInt();
        int fuel = sc.nextInt();
        int charge= sc.nextInt();

        int price= distance/mileage;
        int Fuelprice= price*fuel;
        int last= Fuelprice+charge;
        System.out.print("Total Trip Cost = "+last);
    }
}