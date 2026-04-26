import java.util.Scanner;

public class ifelse21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" === Welcome to Bank ===");

        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Initial Deposit: ");
        int deposit = sc.nextInt();

        System.out.println();
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        System.out.print("Choose Option: ");
        int type = sc.nextInt();

        switch (type) {
            case 1:
                System.out.print("Enter deposit amount: ");
                int additional  = sc.nextInt();
                if(additional<=0){
                     System.out.println("ERROR: Enter a valid amount!");
           
                }
                else{
                    deposit = deposit + additional;
                    System.out.println("Sucess! Rs ."+ additional + " deposited.");
                    System.out.println("Current Balance: Rs." + deposit);
                }
                break;
            case 2:
                System.out.println("Enter withdraw amount: ");
                int withdraw = sc.nextInt();
                if(withdraw<=0){
                    System.out.println("ERROR: Enter a valid amount!");
                }
                else if(deposit < withdraw){
                    System.out.println("ERROR: Insufficient Balance!");
                    System.out.println("Current Balance: Rs." + deposit);
                }
                else{
                    deposit -= withdraw;
                     System.out.println("Success! Rs." + withdraw + " withdrawn.");
                    System.out.println("Current Balance: Rs." + deposit);
                }
                break;
            case 3:
                System.out.println("Current Balance: " + deposit);
                break;
            case 4:
                System.out.println("Thank you & Good bye");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
