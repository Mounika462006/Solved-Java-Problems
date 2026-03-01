import java.util.Scanner;

public class ifelse6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bookingClass = sc.nextLine();
        int daysUnitDep =sc.nextInt();
        double seatAvailable = sc.nextDouble();
        sc.nextLine();
        String routeType = sc.nextLine();

        double a =0;
        double mul=0.0;
        String str = "";

        System.out.println("Booking Class: " + bookingClass);
        System.out.println("Days Until Departure: " + daysUnitDep);
        System.out.printf("Seat Availability: %.1f%%\n",seatAvailable);
        System.out.println("Route Type: " + routeType);

        if(bookingClass.equalsIgnoreCase("Economy")){
            if(routeType.equalsIgnoreCase("Domestic")){
                a=200;
            }
            else if(routeType.equalsIgnoreCase("International-Short")){
                a=500;
            }
            else if(routeType.equalsIgnoreCase("International-Long")){
                a=800;
            }
        }
        else if(bookingClass.equalsIgnoreCase("Business")){
             if(routeType.equalsIgnoreCase("Domestic")){
                a=600;
            }
            else if(routeType.equalsIgnoreCase("International-Short")){
                a=1500;
            }
            else if(routeType.equalsIgnoreCase("International-Long")){
                a=2500;
            }
        }
        else if(bookingClass.equalsIgnoreCase("First")){
             if(routeType.equalsIgnoreCase("Domestic")){
                a=1000;
            }
            else if(routeType.equalsIgnoreCase("International-Short")){
                a=3000;
            }
            else if(routeType.equalsIgnoreCase("International-Long")){
                a=5000;
            }
        }
        System.out.printf("Base Price: $%.1f\n",a);

        if(seatAvailable<30 && daysUnitDep<14){
            mul = 1.8;
            str ="High Demand";
        }
        else if(seatAvailable<50 && daysUnitDep<30){
            mul=1.5;
            str = "High Demand";
        }
        else if(seatAvailable<60 || (daysUnitDep>=30 && daysUnitDep<=60)){
            mul = 1.0;
            str = "Moderate";
        }
        else if(seatAvailable>=60 && daysUnitDep>60){
            mul = 0.8;
            str = "Low Demand";
        }
        System.out.printf("Demand Multiplier:%.1fx\n",mul);
        double last = a*mul;
        System.out.printf("Final Ticket Price:$%.1f\n",last);
        System.out.println("Pricing Category: "+str);

    }
}
