import java.util.Scanner;

public class ifelse16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomCategory = sc.nextLine();
        String season = sc.nextLine();
        int nightsBooked = sc.nextInt();
        sc.nextLine();
        String loyaltyTier = sc.nextLine();

        System.out.println("Room Category: " + roomCategory);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nightsBooked);
        System.out.println("Loyalty Tier: " + loyaltyTier);

        double baseRate = 0.0;
        if(roomCategory.equalsIgnoreCase("Standard")){
            baseRate = 150;
        }
        else if(roomCategory.equalsIgnoreCase("Deluxe")){
            baseRate = 300;
        }
        else if(roomCategory.equalsIgnoreCase("Suite")){
            baseRate = 500;
        }
        else if(roomCategory.equalsIgnoreCase("Presidential")){
            baseRate = 1000;
        }

        System.out.printf("Base Rate Per Night: $%.1f\n",baseRate);

        double seasonalMul = 0.0;
        if(season.equalsIgnoreCase("Off-Peak")){
            seasonalMul=0.7;
        }
        else if(season.equalsIgnoreCase("Regular")){
            seasonalMul=1.0;
        }
        else if(season.equalsIgnoreCase("Peak")){
            seasonalMul=1.5;
        }
        else if(season.equalsIgnoreCase("Holiday")){
            seasonalMul=2.0;
        }
        System.out.printf("Seasonal Multiplier: %.1fx\n",seasonalMul);

        int extended = 0;

        if(nightsBooked>=1 && nightsBooked<=4){
            extended =0;
        }
        else if(nightsBooked>=5 && nightsBooked<=7){
            extended =5;
        }
        else if(nightsBooked>=8 && nightsBooked<=14){
            extended =10;
        }
        else if(nightsBooked>=15){
            extended =20;
        }
        System.out.println("Extended Stay Discount: " + extended +"%");

        int loyalDiscount =0;
        String upgrades =" ";
        if(loyaltyTier.equalsIgnoreCase("None")){
            loyalDiscount = 0;
        }
        else if(loyaltyTier.equalsIgnoreCase("Member")){
            loyalDiscount = 10;
            upgrades = "Free breakfast";
        }
        else if(loyaltyTier.equalsIgnoreCase("Gold")){
            loyalDiscount = 15;
            upgrades = "Free breakfast and spa access";
        }
        else if(loyaltyTier.equalsIgnoreCase("Platinum")){
            loyalDiscount = 20;
            upgrades = "Concierge service, airport transfer, and fine dining";
        }

      System.out.println("Loyalty Discount: " + loyalDiscount+"%");


      double seasonalRate = baseRate * seasonalMul;

      double discountedRate = seasonalRate * (1 - extended / 100.0 ) * (1 - loyalDiscount / 100.0);

      double totalCost = discountedRate * nightsBooked;
        
        System.out.printf("Nightly Rate: $%.1f\n",discountedRate);

      System.out.printf("Total Booking Cost: $%.1f\n",totalCost);
       System.out.println("Complimentary Upgrades: " + upgrades);

    }
} 
