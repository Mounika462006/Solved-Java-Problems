import java.util.Scanner;

public class Basic5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        double bill=sc.nextDouble();
        double service = sc.nextDouble();
        double gst = sc.nextDouble();
        double people = sc.nextDouble();

        double orgService=bill*service/100;
        double orgGst= bill*gst/100;
        double last = bill+orgGst+orgService;
        double perperson=last/people;
        System.out.printf("Amount Per Person = %.2f",perperson);

    }
   
    
}