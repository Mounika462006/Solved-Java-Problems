import java.util.Scanner;

public class for15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        double totalDistance = 0.0;
        double totalrevenue =0.0;

        for(int i=1;i<=n;i++){
            double distanceKM = sc.nextDouble();
            String timeofday = sc.next();

            totalDistance = totalDistance + distanceKM;

            System.out.println("Ride: " + i);
            System.out.println("Distance: " + distanceKM + "km");
            System.out.println("Time: " + timeofday);
            System.out.println("Base Far: $3.0");

            double discharge = distanceKM * 1.00;
            System.out.printf("Distance Charge: $%.1f\n",discharge);
            
            double timesurcharge = 0.0;

            if(timeofday.equalsIgnoreCase("Morning")){
                timesurcharge = 0;
            }
            else if(timeofday.equalsIgnoreCase("Afternoon")){
                timesurcharge = 0;
            }
            else if(timeofday.equalsIgnoreCase("Evening")){
                timesurcharge = 3;
            }
            else if(timeofday.equalsIgnoreCase("Night")){
                timesurcharge = 5;
            }
            System.out.printf("Time Surcharge: $%.1f\n",timesurcharge);

            double  totalFare = 3.0 + discharge + timesurcharge;
            System.out.printf("Total Fare: $%.1f\n",totalFare);
            totalrevenue = totalrevenue + totalFare;
            System.out.println();
        }
        System.out.println("Total Rides: "+ n);
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Revenue: $ " + totalrevenue);

        double avrg = totalrevenue / n ;
        System.out.println("Average Fare: $" + avrg);


    }
}
