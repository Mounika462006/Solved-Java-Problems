import java.util.Scanner;

public class ifelse20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int storageGB =  sc.nextInt();
        int userCount = sc.nextInt();
        sc.nextLine();
        String backupFrequency = sc.nextLine();
        String supportTier = sc.nextLine();

        System.out.println("Storage Capaciy: " + storageGB + " GB");
        System.out.println("User Count: " + userCount);
        System.out.println("Backup Frequency: " + backupFrequency);
        System.out.println("Support Tier: " + supportTier);

        double baseStorage = 0.0;

        if(storageGB>=10 && storageGB<=100){
            baseStorage = 0.05;
        }
        else if(storageGB<=500){
                baseStorage = (100 * 0.05) +
                          ((storageGB - 100) * 0.04);
        }
        else if(storageGB <=2000){
            baseStorage = (100 * 0.05) +
                          (400 * 0.04) +
                          ((storageGB - 500) * 0.03);
        }
        else if(storageGB >=2001){
            baseStorage = (100 * 0.05) +
                          (400 * 0.04) +
                          (1500 * 0.03) +
                          ((storageGB - 2000) * 0.02);
        }
         System.out.printf("Base Storage Cost: $%.1f\n", baseStorage);

         double userFee = 0.0;

        if(userCount <= 10){
            userFee = userCount * 5;
        }
        else if(userCount <= 50){
            userFee = userCount * 4;
        }
        else{
            userFee = userCount * 3;
        }

        System.out.printf("Per-User Fee: $%.1f\n", userFee);

        double backupPremium = 0.0;

        if(backupFrequency.equalsIgnoreCase("Daily")){
            backupPremium = 0;
        }
        else if(backupFrequency.equalsIgnoreCase("Hourly")){
            backupPremium = 15 + (0.5 * userCount);
        }
        else if(backupFrequency.equalsIgnoreCase("Real-Time")){
            backupPremium = 50 + (1 * userCount);
        }

        System.out.printf("Backup Premium: $%.1f\n", backupPremium);

         double supportFee = 0.0;

        if(supportTier.equalsIgnoreCase("Community")){
            supportFee = 0;
        }
        else if(supportTier.equalsIgnoreCase("Standard")){
            supportFee = 20;
        }
        else if(supportTier.equalsIgnoreCase("Priority")){
            supportFee = 75;
        }
        else if(supportTier.equalsIgnoreCase("Enterprise")){
            supportFee = 200;
        }

        System.out.printf("Support Fee: $%.1f\n", supportFee);

        double monthly = baseStorage + userFee + backupPremium + supportFee;
        double annual = monthly * 12 * 0.9;

        System.out.printf("Monthly Subscription: $%.1f\n", monthly);
        System.out.printf("Annual Subscription: $%.1f (save 10%%)\n", annual);

         String plan = "";
        String features = "";

        if(userCount == 1){
            plan = "Personal";
            features = "Basic storage, file sync";
        }
        else if(userCount <= 20){
            plan = "Team";
            features = "Version history, file sharing, basic analytics";
        }
        else if(userCount <= 100){
            plan = "Business";
            features = "Advanced sharing, team analytics, priority support";
        }
        else{
            plan = "Enterprise";
            features = "Advanced security, compliance tools, dedicated support, API access";
        }

        System.out.println("Recommended Plan: " + plan);
        System.out.println("Included Features: " + features);

    }
}
