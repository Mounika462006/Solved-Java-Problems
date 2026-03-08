import java.util.Scanner;

public class for19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int  n = sc.nextInt();
        int Expired=0;
        int soon =0;
        int active =0;

        for(int i=1;i<=n;i++){
            String prodID = sc.next();
            String  prodType = sc.next();
            int purchase = sc.nextInt();

            System.out.println("Product ID: " + prodID);
            System.out.println("Type: " + prodType);
            System.out.println("Months Used: "+ purchase);

            int warranty =0;

            if(prodType.equalsIgnoreCase("Electonics")){
                warranty = 12;
            }
            else  if(prodType.equalsIgnoreCase("Appliance")){
                warranty = 24;
            }
            else  if(prodType.equalsIgnoreCase("Computer")){
                warranty = 36;
            }
            System.out.println("Warranty Period: "+ warranty +" months");
            
            int remaing = warranty - purchase;
             if (remaing < 0) {
                remaing = 0;
            }
            System.out.println("Remaining: "+ remaing + "months");

            if(remaing ==0){
                System.out.println("Status: Expired");
                Expired++;
            }
            else if(remaing >=1 && remaing <=3){
                System.out.println("Status: Expiring Soon");
                soon++;
            }
            else{
               System.out.println("Status: Active");
               active++;

            }
            System.out.println();
        }
        System.out.println("Total Products: " + n);
        System.out.println("Active Warranties: " + Expired);
        System.out.println("Expiring Soon: "+ soon);
        System.out.println("Expired Warranties: "+ active);
    }
}
