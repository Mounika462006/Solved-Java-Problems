import java.util.Scanner;

public class while28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter OTP: ");
        int coreOTP = sc.nextInt();

        int i=3;
        while(i<=3 && i>0){
            System.out.println("Enter OTP: ");
            int trail = sc.nextInt();
            if(trail == coreOTP){
                System.out.println("Access Granted");
            }
            else{
                int bal = i-1;
                if(bal==0){
                    System.out.print("Invalid OTP! ");
                    System.out.println("Attempts Finish");
                }
                else{
                    System.out.print("Invalid OTP! ");
                    System.out.println("Attempts left: " + bal);
                }
                
                
            }
            i--;
        }
    }
}
