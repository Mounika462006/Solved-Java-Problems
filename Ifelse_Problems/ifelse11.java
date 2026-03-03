import java.util.Scanner;

public class ifelse11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String orderType = sc.nextLine();
        String loyalStatus = sc.nextLine();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();


        System.out.println("Order Type: " + orderType);
        System.out.println("Loyalty Status: " + loyalStatus);
        System.out.printf("Order Value: $ %.1f\n",orderValue);
        System.out.println("Time Slot: " + timeSlot);

        int baseDis = 0;

        if(loyalStatus.equalsIgnoreCase("Gold")){
            baseDis = 15;
        }
        else if(loyalStatus.equalsIgnoreCase("Silver")){
            baseDis = 10;
        }
        else if(loyalStatus.equalsIgnoreCase("Bronze")){
            baseDis = 5;
        }
        else{
            baseDis=0;
        }
        System.out.println("Base Discount: " + baseDis +"%");

        int timebaseAdj = 0;

        if(timeSlot.equalsIgnoreCase("Peak")){
            timebaseAdj =0;
        }
        else if(timeSlot.equalsIgnoreCase("Regular")){
            timebaseAdj =0;
        }
        else if(timeSlot.equalsIgnoreCase("Late-Night")){
            timebaseAdj =-5;
        }
        System.out.println("Time-Baed Adjustment: " + timebaseAdj +"%");

        double  serviceFee = 0.0;

        if(orderType.equalsIgnoreCase("Delivery")){
            serviceFee = orderValue*0.10;
        }
        else if(orderType.equalsIgnoreCase("Takeout")){
            serviceFee = orderValue*0.03;
        }
        else if(orderType.equalsIgnoreCase("Dine-In")){
            serviceFee = 0.0;
        }

        System.out.printf("Service Fee: $ %.1f\n",serviceFee);
        double total = baseDis + timebaseAdj;
        double discountedValue = orderValue * (1 - total/100.0);
        double finalAmount = discountedValue + serviceFee;

        System.out.printf("Final Amount: $%.1f\n",finalAmount);

        String kitchen = " ";
        if(timeSlot.equalsIgnoreCase("Peak") &&
         orderType.equalsIgnoreCase("Delivery")){
            kitchen ="High";
        }
        else if(timeSlot.equalsIgnoreCase("Regular")){
            kitchen ="Medium";
        }
        else if(timeSlot.equalsIgnoreCase("Late-Night")){
            kitchen ="Low";
        }

        System.out.println("Kitchen Priority: " + kitchen);

        int estimate =0;
        if (kitchen.equals("High")) {
            if (orderValue > 70) {
               estimate= 25;
            } else {
               estimate = 30;
            }
        } 
        else if (kitchen.equals("Medium")) {
            if (orderValue > 100) {
                estimate = 25;
            } else {
                estimate= 20;
            }
        } 
        else if (kitchen.equals("Low")) {
            estimate = 15;
        }

            System.out.println("Estimated Prep Time: " + estimate + " minutes");

        
    }
}
