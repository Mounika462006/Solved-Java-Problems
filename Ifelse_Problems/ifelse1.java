import java.util.Scanner;

public class ifelse1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int perRating = sc.nextInt();
        int yearofService = sc.nextInt();
        sc.nextLine();
        String departmentType = sc.nextLine();
        double baseSalary = sc.nextDouble();
        int a=0;
        System.out.println("Performace Rating : " + perRating);
        System.out.println("Years of Service: " + yearofService);
        System.out.println("Department: " + departmentType);


        if(perRating>=3 && perRating<=5){

            if(departmentType.equals("Critical")){

                if (perRating==5 && yearofService>=5) {
                     a= 25;
                }
                else if (perRating==4 && yearofService>=10) {
                    a =22;
                }
                else if (perRating==4) {
                     a =15;
                }
                else if (perRating==3) {
                    a =10;
                }
                
            }
            else if(departmentType.equalsIgnoreCase("Non-Critical")){
                if (perRating==5 ) {
                    a =18;
                }
                else if (perRating==4) {
                    a=12;
                }
                else if (perRating==3) {
                    a=8;
                }
            
            }
        
        }
   
    System.out.println("Bonus Percentage: " + a +"%");
     double bonuAmt = baseSalary * ( a /100.0);
    System.out.printf("Bonus Amount: $%.2f\n", bonuAmt);
    if(a>0){
        System.out.println("Eligible");
    }else{
        System.out.println("Not Eligible");
    }

    }
}
