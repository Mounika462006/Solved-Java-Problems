import java.util.Scanner;

public class ifelse5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double a=0;
        String str=" ";

        double gpa =sc.nextDouble();
        double familyIncome = sc.nextDouble();
        int extraCuricular = sc.nextInt();
        sc.nextLine();
        String scholarType = sc.nextLine();

        System.out.printf("GPA:%.1f\n" , gpa);
        System.out.printf("Family Income: $ %.1f\n",familyIncome);
        System.out.println("Extracurricular Score: "+extraCuricular);
        System.out.println("Scholarship Type: "+scholarType);

        if(gpa>=2.5){
            System.out.println("Eligibility: Eligible");
        }else{
            System.out.println("Eligibility: Not Eligible");
        }

        if(scholarType.equalsIgnoreCase("Merit")){
            if(gpa>=3.8 && extraCuricular>=80){
                a=250000;
                str ="Full";
            }
            else if(gpa>=3.5 && extraCuricular>=70){
                a=150000;
                str ="Partial";
            }
            else if(gpa>=3.0 && extraCuricular>=60){
                a=8000;
                str ="Minimal";
            }
        }
        else if(scholarType.equalsIgnoreCase("Need Based")){
            if(gpa>=3.5 && familyIncome<=30000){
                a=30000;
                str ="Full";
            }
            else if(gpa>=3.0 && familyIncome<=50000){
                a=180000;
                  str ="Partial";
            }
            else if(gpa>=2.8 && familyIncome<=70000){
                a=10000;
                 str ="Minimal";
            }
        }
        else if(scholarType.equalsIgnoreCase("Sports")){
            if(gpa>=3.0 && extraCuricular>=85 ){
                a=22000;
                str="Full";
            }
            else if(gpa>=2.8 && extraCuricular>=75){
                a=20000;
                 str ="Partial";
            }
            else if(gpa>=2.5 && extraCuricular>=65){
                a=12000;
                 str ="Minimal";
            }
        }

        System.out.printf("Award Amount: $%.1f\n",a);
        System.out.println("Award Category: " + str);


    }
}
