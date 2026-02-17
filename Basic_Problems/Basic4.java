
import java.util.Scanner;
public class Basic4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tution = sc.nextInt();
        int scholar = sc.nextInt();
        int exam = sc.nextInt();
        int lib= sc.nextInt();

        int discount =(tution*scholar/100);
        int last = tution-discount;
        int fi = last+exam+lib;
        System.out.println("Final Payable Fee = "+fi);
    }
}
