import java.util.Scanner;

public class for6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double initialBal = sc.nextDouble();
        int n =sc.nextInt();

        int count =0;
        String str = " ";
        int add=0;
        int add1=0;
        double sum=0.0;

        for(int i=1;i<=n;i++){
            double withdraw = sc.nextDouble();
            System.out.println("Transaction "+ i+": $ " +withdraw);

            if(withdraw<= initialBal){
                str = "Approved";
                System.out.println("Status: "+ str);
                initialBal = initialBal - withdraw;
                System.out.printf("Remaining Balance: $%.1f\n",initialBal);
            }

            else{
                str ="Denied";
                System.out.println("Status: "+ str);
                System.out.println("Reason: Insufficient Funds");
                System.out.printf("Remaining Balance: $%.1f\n",initialBal);
            }
           
            count++;

            if(str.equalsIgnoreCase("Approved")){
                add++;
            }
            else{
                add1++;
            }
            if(str.equalsIgnoreCase("Approved")){
                sum =sum+withdraw;
            }
            System.out.println();
        }
        System.out.println("Total Transactions: " + count);
        System.out.println("Successful Withdrawls: " + add);
        System.out.println("Failed Withdrawals: " + add1);
        System.out.printf("Final Balance: $%.1f\n",initialBal);
        System.out.printf("Total Withdrawn: $%.1f\n",sum);
    }   
}
