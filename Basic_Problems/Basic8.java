import java.util.Scanner;

public class Basic8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rod = sc.nextInt();
        int worked = sc.nextInt();
        int overTime = sc.nextInt();
        int reject = sc.nextInt();

        int FinalProduction = (rod * worked) + overTime - reject;
        System.out.println("Usable Rods = " + FinalProduction);
    }

}
