import java.util.Scanner;

public class Basic16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gen = sc.nextInt();
        int fare = sc.nextInt();
        int acpass= sc.nextInt();
        int acfare = sc.nextInt();
        int platform = sc.nextInt();
        int maintance = sc.nextInt();
        int fuel = sc.nextInt();
        int net = (gen * fare) + ( acpass * acfare) + platform -maintance - fuel;
        System.out.println("Net Railway Revenue = "+ net);
    }
}
