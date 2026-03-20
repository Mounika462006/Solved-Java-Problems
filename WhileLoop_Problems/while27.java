import java.util.Scanner;

public class while27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tha amount: ");
        int amount = sc.nextInt();

         while(amount<10){
            System.out.println("Invalid! Minimum ₹10");
            System.out.println("Enter amount: ");
            amount = sc.nextInt();
         }

         System.out.println("Recharge successful!");

        
    }
}