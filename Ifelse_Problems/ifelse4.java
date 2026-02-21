import java.util.Scanner;

public class ifelse4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String loyalTier = sc.nextLine();
        double cartValue = sc.nextDouble();
        sc.nextLine();
        String proCategory = sc.nextLine();
        String memberShip = sc.nextLine();
        int percentage=0;
        int carper =0;
        int extra =0;
        int total=0;
        double finalPrice=0;
        double savings =0;
        System.out.println("Loyalty Tier: " + loyalTier);
        System.out.println("Cart Value:$" + cartValue);
        System.out.println("Product Category: " +proCategory);
        System.out.println("Membership: " + memberShip);


        if(loyalTier.equalsIgnoreCase("Bronze")){
            percentage = 5;
        }
        else if(loyalTier.equalsIgnoreCase("Silver")){
            percentage = 8;
        }
        else if(loyalTier.equalsIgnoreCase("Gold")){
            percentage = 12;
        }
        else if(loyalTier.equalsIgnoreCase("Platinum")){
            percentage =15;
        }
        
        System.out.println("Base Discount: "+ percentage+" %");

        if(cartValue>=500 && cartValue<=999){
            carper =3;
        }else if(cartValue>=1000 && cartValue<=1999){
            carper =5;
        }else if(cartValue>=2000){
            carper=7;
        }

        int exact = carper;
        

        if(memberShip.equalsIgnoreCase("Prime") && proCategory.equalsIgnoreCase("Electronics")){
            extra = exact+5;
        }
        else if(proCategory.equalsIgnoreCase("Fashion")){
            extra = exact+3;
        }
        else if(proCategory.equalsIgnoreCase("Books") && memberShip.equalsIgnoreCase("Prime")){
            extra=exact+5;
        }
        else if((proCategory.equalsIgnoreCase("Groceries")) && cartValue>300){
            extra=exact+2;
        }
        else{
            extra=exact+0;
        }

        System.out.println("Additional Discount: "+ extra +" %");

        total = percentage+extra;
        System.out.println("Total Discount: " + total+" %");

        finalPrice = cartValue *(1-total/100.0);
        System.out.printf("Final Price: $%.1f\n",finalPrice);

        savings = cartValue - finalPrice;
        System.out.printf("Savings: $%.1f",savings);
    }


}
