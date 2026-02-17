import java.util.Scanner;

public class Basic7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int worked =sc.nextInt();
        int wage = sc.nextInt();
        int bonus = sc.nextInt();
        int charge= sc.nextInt();

        int base= worked*wage;
        int addBonus = base+bonus;
        int deduct = addBonus - charge;
        System.out.println("Final Weekly Wage = "+ deduct);
    }
}
