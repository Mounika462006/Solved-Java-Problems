import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000; // initial balance
        int choice;
        int amount;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    amount = sc.nextInt();
                    balance += amount;
                    System.out.println("Amount Deposited Successfully");
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    amount = sc.nextInt();

                    if(amount > balance) {
                        System.out.println("Insufficient Balance");
                    } else {
                        balance -= amount;
                        System.out.println("Please collect your cash");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! Visit again");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);
    }
}
