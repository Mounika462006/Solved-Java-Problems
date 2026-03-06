import java.util.Scanner;

public class for1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        int increment =0;
        double payroll = 0;
        for(int i=1;i<=n;i++){
            String employeeName = sc.next();
            double baseSalary = sc.nextDouble();
            int performanceRating = sc.nextInt();    
            
            System.out.println("Employee: " + employeeName);
            System.out.println("Base Salary: $" + baseSalary);
            System.out.println("Performance Rating: " + performanceRating);

            
            if(performanceRating == 5){
                increment = 15;
            }
            else if(performanceRating == 4){
                increment = 10;
            }
            else if(performanceRating == 3){
                increment = 5;
            }
            else if(performanceRating == 2){
                increment = 2;
            }
            else if(performanceRating == 1){
                increment =0;
            }
            System.out.println("Increment: " + increment +"%");

            double finalsalary =  baseSalary * (1 + increment/100.0);
           
            System.out.printf("Final Salary: $%.1f\n",finalsalary);
             payroll = payroll+ finalsalary;
        }
        System.out.println("Total Employees Processed: " + n);
        System.out.printf("Total Payroll: $%.1f\n",payroll);
        double avrg = payroll/n;
        System.out.printf("Average Salary:$%.1f\n",avrg);

    }
}

