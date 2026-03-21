import java.util.Scanner;

public class dowhile1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        do{
            switch (choice) {
                case 1:
                    System.out.println("Order Placed: Pizza");
                    break;
                case 2:
                    System.out.println("Order Placed: Burger");
                    break;

            }
            choice = sc.nextInt();
        }while(choice !=3);
        System.out.println("Goodbye");
    }
}
