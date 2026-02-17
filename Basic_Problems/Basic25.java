import java.util.Scanner;

public class Basic25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resusage = sc.nextInt();
        int resrate = sc.nextInt();
        int comusage= sc.nextInt();
        int comrate= sc.nextInt();
        int connection= sc.nextInt();
        int penalty = sc.nextInt();
        int maintance = sc.nextInt();
        int treatment = sc.nextInt();

        int net = (resusage * resrate ) + ( comusage * comrate ) + connection + penalty - maintance - treatment;
        System.out.println("Net Water Revenue = " +net);
    }
}
