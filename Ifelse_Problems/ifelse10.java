import java.util.Scanner;

public class ifelse10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String timeofDay = sc.nextLine();
        double powerConsumption =sc.nextDouble();
        double renewablePercent = sc.nextDouble();
        sc.nextLine();
        String rateTier = sc.nextLine(); 
        
        double val = 0.0;
        double ratemul =0.0;

        System.out.println("Time of Day: " + timeofDay);
        System.out.printf("Power Consumption: %.1f kWh \n ",powerConsumption);
        System.out.printf("Renewable Energy: %.1f %% \n",renewablePercent);
        System.out.println("Rate Tier: "+ rateTier);

        if(rateTier.equalsIgnoreCase("Basic")){
             val = 0.18;
        }
        else if(rateTier.equalsIgnoreCase("Time-of-use")){
            val = 0.15;
        }
        else if(rateTier.equalsIgnoreCase("Premium-Green")){
            val=0.12;
        }

        System.out.printf("Base Rate: $%.2f/kWh\n" , val);
        
        if(timeofDay.equalsIgnoreCase("Peak")){
            if(rateTier.equalsIgnoreCase("Time-of-Use")){
                ratemul=1.8;
            }else{
                ratemul =1.5;
            }
        }
        else if(timeofDay.equalsIgnoreCase("Off-Peak")){
            if(rateTier.equalsIgnoreCase("Time-of-Use")){
                ratemul=0.8;
            }
            else{
                ratemul =1.0;
            }
        }
        else if(timeofDay.equalsIgnoreCase("Super-off-Peak")){
            if(rateTier.equalsIgnoreCase("Premium-Green")){
                ratemul=0.8;
            }
            else{
                ratemul =0.5;
            }
        }
        System.out.printf("Rate Multiplier: %.1fx\n",ratemul);

        double renewable = (powerConsumption * renewablePercent /100) * val;
        System.out.printf("Renewable Credit:$%.1f\n",renewable);

        double total = (powerConsumption * val * ratemul) - renewable;
        System.out.printf("Total Cost: $%.1f\n",total);


         String recommendation = "";

        if (timeofDay.equalsIgnoreCase("Peak") && renewable < 30) {
            recommendation = "Shift high-power appliances to Off-Peak hours";
        } 
        else if (renewable >= 60) {
            recommendation = "Excellent! Maximize appliance use during this period";
        } 
        else if (rateTier.equals("Basic") && powerConsumption > 20) {
            recommendation = "Consider upgrading to Time-of-Use plan";
        } 
        else if (renewable >= 70) {
            recommendation = "Great renewable usage! Minor peak reduction possible";
        } 
        else {
            recommendation = "Good timing! Consider increasing renewable capacity";
        }
        System.out.println("Optimization Recommendation: "+ recommendation);

        double potentialSavings = 0.0;
        if (timeofDay.equals("Peak")) {
            double offPeakMultiplier = 1.0;
            if (rateTier.equals("Time-of-Use"))
                offPeakMultiplier = 0.8;

            double offPeakCost = 
                (powerConsumption * val * offPeakMultiplier) - renewable;

            potentialSavings = total - offPeakCost;

            if (potentialSavings < 0)
                potentialSavings = 0.0;
        }

        System.out.printf("Potential Savings: $%.1f\n", potentialSavings);
    }
}


