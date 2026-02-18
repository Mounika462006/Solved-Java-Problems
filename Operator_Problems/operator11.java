import java.util.Scanner;

public class operator11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int baseBox = sc.nextInt();
        int level = sc.nextInt();
        int mul = baseBox << level;
        System.out.println("Total Capacity = "+ mul);
    }
}
