import java.util.Scanner;

public class ifelse15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userCount = sc.nextInt();
        sc.nextLine();
        String licenseType = sc.nextLine();
        String supportLevel = sc.nextLine();
        int contractYear = sc.nextInt();

        System.out.println("User Count: " + userCount);
        System.out.println("License Type: " + licenseType);
        System.out.println("Support Level: " + supportLevel);
        System.out.println("Contract Duration: " + contractYear + " years");

        double basePrice = 0.0;
        if (licenseType.equalsIgnoreCase("Standard")) {
            basePrice =60;
        }
        else if(licenseType.equalsIgnoreCase("Professional")){
            basePrice= 120;
        }
        else if(licenseType.equalsIgnoreCase("Enterprise")){
            basePrice  = 200;
        }

        System.out.printf("Base Price Per User: $%.1f\n" ,basePrice);

        int volumeDiscount =0;

        if(userCount>=1 && userCount<=50){
            volumeDiscount =0;
        }
        else if(userCount>=51 && userCount<=200){
            volumeDiscount =15;
        }
        else if(userCount>=201 && userCount <=500){
            volumeDiscount = 20;
        }
        else if(userCount>=501 && userCount<=1000){
            volumeDiscount = 25;
        }
        else if(userCount>=1001){
            volumeDiscount =35;
        }

        System.out.println("Volume Discount: " + volumeDiscount + "%");

        double supportFee =0.0;

        if(supportLevel.equalsIgnoreCase("Basic")){
            supportFee = 10;
        }
        else if(supportLevel.equalsIgnoreCase("Priority")){
            supportFee = 30;
        }
        else if(supportLevel.equalsIgnoreCase("Premium")){
            supportFee = 80;
        }
        System.out.printf("Support Fee Per User: $%.1f\n",supportFee);

        int multiYear = 0;

        if(contractYear ==1){
            multiYear = 0;
        }
        else if(contractYear == 2){
            multiYear = 5 ;
        }
        else if(contractYear == 3){
            multiYear = 10;
        }
        else if(contractYear == 5){
            multiYear = 20;
        }
        System.out.println("Multi-Year Discount: " + multiYear+"%");

        double discountedBase =( basePrice * (1 - volumeDiscount/100.0));

        double annualPeruser = (discountedBase + supportFee) * (1 - multiYear / 100.0);
        System.out.printf("Annual Cost Per User: $%.1f\n",annualPeruser);

        double totalAnuual = annualPeruser * userCount;
        System.out.printf("Total Annual Cost: $%.1f\n",totalAnuual);

        double contractValue = totalAnuual * contractYear;
        System.out.printf("Total Contract Value: $%.1f\n",contractValue);

        String str=" ";
        if(userCount<200){
            str ="Small Business";
        }
        else if(userCount>=200 && userCount<=1000){
            str ="Mid-Market";
        }
        else if(userCount>1000){
            str = "Enterprise";
        }
        System.out.println("Pricing Tier: " + str);

    }
}
