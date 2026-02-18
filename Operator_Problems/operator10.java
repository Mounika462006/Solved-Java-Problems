import java.util.Scanner;

public class operator10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitConsumed = sc.nextInt();
        int voltage = sc.nextInt();
        if(unitConsumed>500 || voltage==1){
            System.out.println("Alert Triggered");
        }else{
            System.out.println("Noraml Usage");
        }
    }
}
