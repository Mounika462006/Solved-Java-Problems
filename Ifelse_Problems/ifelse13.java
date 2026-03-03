import java.util.Scanner;

public class ifelse13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  studentStatus = sc.nextLine();
        int creditHours = sc.nextInt();
        sc.nextLine();
        String progrmType = sc.nextLine();
        String  residency = sc.nextLine();

        System.out.println("Student Status: " + studentStatus);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Program Type: " + progrmType);
        System.out.println("Residency: " + residency);


        double tuition = 0.0;
        if(progrmType.equalsIgnoreCase("Undergraduate")){
            tuition =350;
        }
        else if(progrmType.equalsIgnoreCase("Graduate")){
            tuition = 550;
        }
        else if(progrmType.equalsIgnoreCase("Professional")){
            tuition = 800;
        }

        System.out.printf("Base Tuition Per Credit: $%.1f\n",tuition);


        double residencymul= 0.0;

        if(residency.equalsIgnoreCase("In-State")){
            residencymul = 1.0;
        }
        else if(residency.equalsIgnoreCase("Out-of-State")){
            residencymul=2.5;
        }
        else if(residency.equalsIgnoreCase("International")){
            residencymul = 3.0;
        }
        System.out.printf("Residency Multiplier: $%.1fx\n",residencymul);

        double profees = 0.0;

        if(studentStatus.equalsIgnoreCase("Full-Time")){
            if(progrmType.equalsIgnoreCase("Undergraduate")){
                profees = 300;
            }
            else if(progrmType.equalsIgnoreCase("Graduate")){
                profees = 750;
            }
            else if(progrmType.equalsIgnoreCase("Professional")){
                profees = 1200;
            }
        }
        else if(studentStatus.equalsIgnoreCase("Part-Time")){
            if(progrmType.equalsIgnoreCase("Undergraduate")){
                profees = 300;
            }
            else if(progrmType.equalsIgnoreCase("Graduate")){
                profees = 750;
            }
            else if(progrmType.equalsIgnoreCase("Professional")){
                profees = 900;
            }
        }
        else{
            if(studentStatus.equalsIgnoreCase("Continuing-Education")){
                profees = 150;
            }
        }

        System.out.printf("Program Fee: $%.1f\n",profees);

       double activity = 0.0;
        if (studentStatus.equalsIgnoreCase("Full-Time")) {
            activity = 200;
        }
        else if(studentStatus.equalsIgnoreCase("Part-Time")){
            activity=100;
        }
        else if(studentStatus.equalsIgnoreCase("Continuing-Education")){
            activity=50;
        }
        System.out.printf("Student Activity Fee: $%.1f\n",activity);

        double Tuitioncost = creditHours * tuition * residencymul;
        double totalfee = Tuitioncost + profees + activity;

        System.out.printf("Total Registration Fee: $%.1f\n",totalfee);

        String feeCategory = " ";

        if(residency.equalsIgnoreCase("In-State") &&
            studentStatus.equalsIgnoreCase("Full-Time")
        ){
            feeCategory ="Standard";
        }
        else  if(residency.equalsIgnoreCase("Out-of-State") &&
            progrmType.equalsIgnoreCase("Professional")
        ){
            feeCategory ="Standard";
        }
        else if(studentStatus.equalsIgnoreCase("Continuing-Education")){
            feeCategory ="Reduced";
        }
        System.out.println("Fee Category: " + feeCategory);

       
    }
}
