import java.util.Scanner;

public class Basic14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int base = sc.nextInt();
        int session = sc.nextInt();
        int pay = sc.nextInt();
        int bonus =sc.nextInt();
        int maintance = sc.nextInt();
        int salary = base + ( session * pay )+ bonus - maintance;
        System.out.println("Final Salary = "+salary);
    }
}
