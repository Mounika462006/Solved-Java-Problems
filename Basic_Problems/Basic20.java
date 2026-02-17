import java.util.Scanner;
public class Basic20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ads= sc.nextInt();
        int sponsorship = sc.nextInt();
        int affiliate = sc.nextInt();
        int tax = sc.nextInt();
        int production = sc.nextInt();
        int income = ads + sponsorship + affiliate - tax - production;
        System.out.println("Final Youtube Income = " + income);
    }
}
