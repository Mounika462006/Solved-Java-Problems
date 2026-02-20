import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double debtToIncomeRation = sc.nextDouble();
        sc.nextLine();
        String loanType = sc.nextLine();
        double a=0;
        System.out.println("Credit Score:" + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.printf("Debt-to-Income Ratio: %.1f%%", debtToIncomeRation);
        System.out.println("\nLoan Type: "+loanType);

        if(loanType.equalsIgnoreCase("Home")){
            if(creditScore>=750 && debtToIncomeRation<=30){
            System.out.println("Decision: Approved");
            a=4*annualIncome;
            }
            else if((creditScore>=700 && creditScore<=749) && (debtToIncomeRation>30 && debtToIncomeRation<=40)){
                System.out.println("Decision: Needs Review");
                a=3*annualIncome;
            }
            else{
                System.out.println("Decision: Rejected");
            }
        }

        else if(loanType.equalsIgnoreCase("Personal")){
            if(creditScore>=750 && debtToIncomeRation<=30){
            System.out.println("Decision: Approved");
            a=1*annualIncome;
            }
            else if((creditScore>=650 && creditScore<=699) && (debtToIncomeRation>30 && debtToIncomeRation<=40)){
                System.out.println("Decision: Needs Review");
                a=0.5*annualIncome;
            }
            else{
                System.out.println("Decision: Rejected");
            }
        }
        else if(loanType.equalsIgnoreCase("Business")){
            if((creditScore>=700 && debtToIncomeRation<=40)){
                System.out.println("Decision: Approved");
                a=3*annualIncome;
            }
            else{
                System.out.println("Decision: Rejected");
            }
        }
        if(a>0){
            System.out.printf("Maximum Loan Amount:$%.1f\n",a);
        }
    }
   
}   
       



