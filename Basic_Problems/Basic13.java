import java.util.Scanner;

public class Basic13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int yield = sc.nextInt();
        int acres = sc.nextInt();
        int extra = sc.nextInt();
        int damaged = sc.nextInt();
        int last = ( yield * acres ) + extra - damaged;
        System.out.println("Marketable Yield = " + last);
    }
}
