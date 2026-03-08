import java.util.Scanner;

public class for17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  urgentrenewable =0;
        double sum  = 0.0;
        for(int i=1;i<=n;i++){
            String memName = sc.next();
            String memshipType = sc.next();
            int days = sc.nextInt();

            System.out.println("Member: " + memName);
            System.out.println("Membership: " +memshipType);
            System.out.println("Days Until Expiry: " + days);

            double renewalFee = 0;
            if(memshipType.equalsIgnoreCase("Basic")){
                renewalFee = 50;
            }
            else if(memshipType.equalsIgnoreCase("Premium")){
                renewalFee = 100;
            }
            else if(memshipType.equalsIgnoreCase("Premium")){
                renewalFee = 100;
            }
            else if(memshipType.equalsIgnoreCase("VIP")){
                renewalFee = 200;
            }
            System.out.println("Renewal Fee: $" + renewalFee);
            sum= sum+ renewalFee;

            int discount =0;

            if(days< 15){
                discount = 0;
            }
            else if(days>=15 && days <=29){
                discount = 10;
            }
            else if( days >= 30 && days <=44){
                discount = 15;
            }
            else if(days >= 45){
                discount = 20;
            }
            System.out.println("Discount: " + discount + " %");
            
            String  priority ="";
            if(days<10){
                priority = "Urgent";
                urgentrenewable++;
            }
            else if(days >=10 && days <=30){
                priority = "High";
            }
            else if(days>=31){
                priority ="Normal";
            }
            System.out.println("Priority: "+ priority);
            
            double finalFee = renewalFee * (1-discount /100.0);
            System.out.println("Final Fee:$ " + finalFee);
            System.out.println();

        }
        System.out.println("Total Members: " + n);
        System.out.println("Urgent Renewals: " + urgentrenewable);
        System.out.println("Total Renewal Revenue: $"+ sum);
        double avrg = sum / n;
        System.out.println("Average Renewable Fee: $" + avrg);

    }
}
