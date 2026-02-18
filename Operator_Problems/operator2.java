import java.util.Scanner;

public class operator2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int accountBalnce = sc.nextInt();
        int withdraw = sc.nextInt();
        int limit = sc.nextInt();
        if(withdraw <=limit && withdraw<=accountBalnce){
            System.out.println("Transaction Approved");
        }else{
            System.out.println("Transaction Declined");
        }
    }
}
