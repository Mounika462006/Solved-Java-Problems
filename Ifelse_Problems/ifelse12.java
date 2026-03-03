import java.util.Scanner;

public class ifelse12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        String vecType = sc.nextLine();
        String drivingRecond = sc.nextLine();
        String coverageLevel = sc.nextLine();

        System.out.println("Driver Age : " + age);
        System.out.println("Vechicle Type: " + vecType);
        System.out.println("Driving Record: " + drivingRecond);
        System.out.println("Coverage Level: " + coverageLevel);

        double basePremium =0.0;
        if(coverageLevel.equalsIgnoreCase("Basic")){
            basePremium = 500;
        }
        else if(coverageLevel.equalsIgnoreCase("Standarad")){
            basePremium = 800;
        }
        else if(coverageLevel.equalsIgnoreCase("Comprehensive")){
            basePremium = 1500;
        }
        System.out.printf("Base Premium: $%.1f\n",basePremium);

        double ageFactor = 0.0;

        if(age >=16 && age<=21){
            ageFactor = 1.8;
        }
        else if(age>=22 && age<=25){
            ageFactor = 1.5;
       }
       else if(age>=26 && age<=40){
            ageFactor = 1.0;
       }
       else if(age>=41 && age<= 60){
            ageFactor = 0.9;
       }
       else if(age>=61){
            ageFactor = 1.1;
       }

       System.out.printf("Age Factor: %.1fx\n",ageFactor);

       double riskFactor = 0.0;

       if(vecType.equalsIgnoreCase("Sedan")){
            riskFactor =1.0;
       }
       else if(vecType.equalsIgnoreCase("SUV")){
            riskFactor =1.2;
       }
       else if(vecType.equalsIgnoreCase("Sports")){
            riskFactor = 1.5;
       }
       else if(vecType.equalsIgnoreCase("Truck")){
            riskFactor = 1.1;
       }

       System.out.printf("Vehicle Risk Factor: %.1fx\n",riskFactor);

       int recodrdAdjust = 0;

       if(drivingRecond.equalsIgnoreCase("Clean")){
        recodrdAdjust = -10;
       }
       else if(drivingRecond.equalsIgnoreCase("Minor-Violations")){
        recodrdAdjust = 25;
       }
       else if(drivingRecond.equalsIgnoreCase("Major-Violations")){
        recodrdAdjust = 50;
       }

       System.out.printf("Record Adjustment: %d%%\n",recodrdAdjust);


       double AdjustmentPremium = basePremium * ageFactor * riskFactor ;
       double finalPremium = AdjustmentPremium * (1 +recodrdAdjust/100.0);
       double monthlyPremium = finalPremium/12;

       System.out.printf("Monthly Premium: $%.2f\n",monthlyPremium);
       System.out.printf("Annual Premium: $%.1f\n",finalPremium);


       String riskCategory = "";
        if (finalPremium < 1000) {
            riskCategory = "Low";
        } else if (finalPremium >= 1000 && finalPremium < 3000) {
            riskCategory = "Medium";
        } else if (finalPremium >= 3000 && finalPremium < 5000) {
            riskCategory = "High";
        } else {
            riskCategory = "Very High";
        }

        System.out.println("Risk Category: "+ riskCategory);

    }   
}
