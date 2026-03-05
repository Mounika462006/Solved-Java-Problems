import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class ifelse18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double packageWeight = sc.nextDouble();
        sc.nextLine();
        String destinationZone = sc.nextLine();
        String shippingSpeed = sc.nextLine();
        String packageSize = sc.nextLine();

        System.out.printf("Package Weight: %.1f lbs\n", packageWeight);
        System.out.println("Destination Zone: " + destinationZone);
        System.out.println("Shipping Speed: " + shippingSpeed);
        System.out.println("Package size: "+ packageSize);

        double baseShippingRate = 0.0;

        if(shippingSpeed.equalsIgnoreCase("Economy")){
            baseShippingRate = 5;
        }
        else if(shippingSpeed.equalsIgnoreCase("Standard")){
            baseShippingRate = 10;
        }
        else if(shippingSpeed.equalsIgnoreCase("Express")){
            baseShippingRate = 25;
        }
        else if(shippingSpeed.equalsIgnoreCase("Overnight")){
            baseShippingRate = 50;
        }
        System.out.printf("Base Shipping Rate: $%.1f\n",baseShippingRate);
        
        double weightSurcharge = 0.0;

        if (packageWeight <= 10) {
            weightSurcharge = packageWeight * 1;
        } else {
            weightSurcharge = packageWeight * 2;
        }

        System.out.printf("Weight Surcharge: $%.1f\n",weightSurcharge);
        
        double zoneMultiplier = 0.0;

        if(destinationZone.equalsIgnoreCase("Local")){
            zoneMultiplier = 1.0;
        }
        else if(destinationZone.equalsIgnoreCase("Regional")){
            zoneMultiplier = 1.2;
        }
        else if(destinationZone.equalsIgnoreCase("National")){
            zoneMultiplier = 1.5;
        }
        else if(destinationZone.equalsIgnoreCase("International")){
            zoneMultiplier = 3.0;
        }
        System.out.printf("Zone Multiplier: %.1fx\n" , zoneMultiplier);

       double sizeCharge = 0.0;
        if(packageSize.equalsIgnoreCase("Small")){
            sizeCharge= 0;
        }
        else if(packageSize.equalsIgnoreCase("Medium")){
            sizeCharge = 5;
        }
        else if(packageSize.equalsIgnoreCase("Large")){
            sizeCharge = 15;
        }
        else if(packageSize.equalsIgnoreCase("Oversized")){
            sizeCharge = 30;
        }
        System.out.printf("Size Surcharge: $%.1f\n", sizeCharge);

        double baseCost = ( baseShippingRate + weightSurcharge) * zoneMultiplier ;
        double totalCost = baseCost + sizeCharge;

        System.out.printf("Total Shipping Cost: $%.1f\n",totalCost);


        int deliveryDays = 0;

        if(shippingSpeed.equals("Economy")) {
             deliveryDays = 7;
        }
        else if(shippingSpeed.equals("Standard")) {
            deliveryDays = 5;
        }
        else if(shippingSpeed.equals("Express")) {
            deliveryDays = 2;
        }
            else if(shippingSpeed.equals("Overnight")) {
              deliveryDays = 1;
        }       

        System.out.println("Estimated Delivery: " + deliveryDays + " business days");

        String str = " ";
        if(shippingSpeed.equalsIgnoreCase("Express")){
            str = "Priority";
        }
        else if(shippingSpeed.equalsIgnoreCase("Economy")){
            str = "Budget";
        }
        else if(shippingSpeed.equalsIgnoreCase("Overnight")){
            str ="Premium";
        }
        else if(shippingSpeed.equalsIgnoreCase("Standard")){
            str ="Standard";
        }

        System.out.println("Service Level: " + str);
    }
}
