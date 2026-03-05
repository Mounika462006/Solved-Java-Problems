import java.util.Scanner;

public class ifelse17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cardTier = sc.nextLine();
        String purchaseCat = sc.nextLine();
        double transactionAmunt = sc.nextDouble();
        sc.nextLine();
        String promotional = sc.nextLine();

        System.out.println("Card Tier: " + cardTier);
        System.out.println("Purchase Category: " + purchaseCat);
        System.out.printf("Transaction Amount: $%.1f\n",transactionAmunt);
        System.out.println("Promotional Status: " + promotional);
        System.out.println("Base Points Rate: 1.0 points per dollar");

        double categoryBonus =1.0;
        if(purchaseCat.equalsIgnoreCase("Groceries")){
            categoryBonus = 2.0;
        }
        else  if(purchaseCat.equalsIgnoreCase("Dining")){
            categoryBonus = 2.5;
        }
        else  if(purchaseCat.equalsIgnoreCase("Travel")){
            categoryBonus = 3.0;
        }
        else  if(purchaseCat.equalsIgnoreCase("Gas")){
            categoryBonus = 2.0;
        }
        else  if(purchaseCat.equalsIgnoreCase("Other")){
            categoryBonus = 1.0;
        }
        System.out.printf("Category Bonus: %.1fx\n",categoryBonus);

        double tierMul=1.0;

        if(cardTier.equalsIgnoreCase("Basic")){
            tierMul =1.0;
        }
        else if(cardTier.equalsIgnoreCase("Gold")){
            tierMul =1.25;
        }
        else if(cardTier.equalsIgnoreCase("Platinum")){
            tierMul =1.5;
        }
        else if(cardTier.equalsIgnoreCase("Black")){
            tierMul =2.0;
        }
        System.out.printf("Tier Multiplier: %.1fx\n",tierMul);

        double proMul=1.0;

        if(promotional.equalsIgnoreCase("None")){
             proMul =1.0;
        }
        else if(promotional.equalsIgnoreCase("Double-Points")){
            proMul =2.0;
        }
        else if(promotional.equalsIgnoreCase("Triple-Points")){
            proMul =3.0;
        }
        System.out.printf("Promotional Multiplier: %.1fx\n",proMul);

        double  pointsEarned = transactionAmunt * 1.0 * categoryBonus * tierMul * proMul;

        double cashValue = pointsEarned * 0.01 ;

        System.out.printf("Points Earned: %.1f\n",pointsEarned);
        System.out.printf("Equivalent Cash Value: $%.1f\n",cashValue);

        String str = " ";

        if(cardTier.equalsIgnoreCase("Platinum")){
            str ="Premium";
        }
        else if(cardTier.equalsIgnoreCase("Gold")){
            str = "Enhanced";
        }
        else if(cardTier.equalsIgnoreCase("Black")){
            str ="Elite";
        }
        else if(cardTier.equalsIgnoreCase("Basic")){
            str = "Standard";
        }
        System.out.println("Rewards Tier: " + str);
    }
}
