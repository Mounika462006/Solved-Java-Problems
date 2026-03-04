import java.util.Scanner;

public class ifelse14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String membershipTier =  sc.nextLine();
        int contractMonths = sc.nextInt();
        sc.nextLine();
        String accessLevel = sc.nextLine();
        String addOns = sc.nextLine();

        System.out.println("Membership Tier: "+ membershipTier);
        System.out.println("Contract Length: " + contractMonths + " months");
        System.out.println("Access Level: "+ accessLevel);
        System.out.println("Add-Ons:" + addOns);

        double basemonthlyTier = 0.0;

        if(membershipTier.equalsIgnoreCase("Basic")){
            basemonthlyTier = 40;
        }
        else if(membershipTier.equalsIgnoreCase("Premium")){
            basemonthlyTier =80;
        }
        else if(membershipTier.equalsIgnoreCase("Elite")){
            basemonthlyTier = 120;
        }
        else if(membershipTier.equalsIgnoreCase("VIP")){
            basemonthlyTier = 150;
        }

        System.out.printf("Base Monthly Fee: $%.1f\n",basemonthlyTier);

        int contract =0;

        if(contractMonths == 1){
            contract = 0;
        }
        else if(contractMonths ==6){
            contract =10;
        }
        else if(contractMonths == 12){
            contract = 15;
        }
        else if(contractMonths == 24){
            contract = 25;
        }
        System.out.println("Contract Discount: "+ contract + "%");

        double accessFee = 0.0;
        
        if(accessLevel.equalsIgnoreCase("Single-Location")){
            accessFee = 0;
        }
        else if(accessLevel.equalsIgnoreCase("Regional")){
            accessFee = 20;
        }
        else if(accessLevel.equalsIgnoreCase("Nationwide")){
            accessFee =50;
        }
        
        System.out.printf("Access Fee: $%.1f\n",accessFee);

        double addOneFee = 0.0;

        if(addOns.equalsIgnoreCase("None")){
            addOneFee =0.0;
        }
        else if(addOns.equalsIgnoreCase("Personal-Training")){
            addOneFee = 100.0;
        }
        else if(addOns.equalsIgnoreCase("Classes")){
            addOneFee=50.0;
        }
        else if(addOns.equalsIgnoreCase("Full-Package")){
            addOneFee =200.0;
        }
        System.out.printf("Add-On Fee: $%.1f\n",addOneFee);

        double totalBeforeDiscount = basemonthlyTier + accessFee + addOneFee;
        double monthlyTotal = totalBeforeDiscount * (1 - contract / 100.0);
        double contractTotal = monthlyTotal * contractMonths;

        System.out.printf("Monthly Total: $%.1f\n",monthlyTotal);
        System.out.printf("Contract Total: $%.1f\n ", contractTotal);

        double saving = ( basemonthlyTier + accessFee + addOneFee ) * contractMonths - contractTotal;

        System.out.printf("Savings vs Month-to-Month : $%.1f\n",saving);

        String category = "";

        if (membershipTier.equals("Basic")) {
            category = "Budget";
        } 
        else if (membershipTier.equals("Premium")) {
            if (monthlyTotal > 150)
                category = "Premium";
            else
                category = "Standard";
        } else if (membershipTier.equals("Elite")) {
            category = "Premium";
        } else if (membershipTier.equals("VIP")) {
            category = "Luxury";
        }
        System.out.println("Membership Category: "+ category);
    }
}
