import java.util.Scanner;

public class ifelse9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double anuualRevenue = sc.nextDouble();
        sc.nextLine();
        String businessType = sc.nextLine();
        double deductiableExpense = sc.nextDouble();
        double tax = sc.nextDouble();
        int taxRate =0;
        System.out.printf("Annual Revenue:$%.1f\n",anuualRevenue);
        System.out.println("Business Type: " + businessType);
        System.out.printf("Deductible Expenses: $%.1f\n",deductiableExpense);
        System.out.printf("Tax Credits:$ %.1f\n",tax);

        double taxable = anuualRevenue - deductiableExpense;
        System.out.printf("Taxable Income:$ %.1f\n",taxable);

        if(businessType.equalsIgnoreCase("C-Corp")){
           if(taxable < 500000){
            taxRate =21;
           }
           else if(taxable >=500000 && taxable <1000000){
            taxRate =24;
           }
           else if(taxable >=1000000 && taxable < 2000000){
            taxRate = 28;
           }
           else if(taxable >= 2000000){
            taxRate = 30;
           }
        }
        else if(businessType.equalsIgnoreCase("S-Corp")){
            if(taxable < 500000){
            taxRate =20;
           }
           else if(taxable >=500000 && taxable <1000000){
            taxRate =25;
           }
           else if(taxable >=1000000){
            taxRate = 28;
           }
        }
        else if(businessType.equalsIgnoreCase("LLC")){
            if(taxable < 200000){
            taxRate =15;
           }
           else if(taxable >=200000 && taxable < 500000){
            taxRate =18;
           }
           else if(taxable >=500000 ){
            taxRate = 22;
           }
        }
        else if(businessType.equalsIgnoreCase("Partnership")){
            if(taxable < 300000){
            taxRate =18;
           }
           else if(taxable >=300000 && taxable <800000){
            taxRate =22;
           }
           else if(taxable >=800000){
            taxRate = 26;
           }
        }

        System.out.println("Tax Rate: " + taxRate + "%");

        double grossTax = taxable * (taxRate/100.0);
        System.out.printf("Gross Tax: $%.1f\n" , grossTax);

        double netTax = grossTax - tax;
        System.out.printf("Net Tax After Credits: $%.1f\n",netTax);

        double effective =(netTax / anuualRevenue )* 100;
        System.out.printf("Effective Tax Rate: %.2f %%\n",effective);


    }
}
