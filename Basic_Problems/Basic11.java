import java.util.Scanner;;

public class Basic11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distance = sc.nextInt();
        int rate = sc.nextInt();
        int maintance = sc.nextInt();
        int allowance = sc.nextInt();
        int subsidy = sc.nextInt();

        int transport = (distance * rate ) + maintance + allowance - subsidy;
        System.out.println("Total Transport Fee = "+ transport);
    }
}
