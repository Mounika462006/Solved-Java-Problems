import java.util.Scanner;

public class for13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int rej =0;
        for(int i=1;i<=n;i++){
            String donorName = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemoglobin = sc.nextDouble();

            System.out.println("Donor: " + donorName);
            System.out.println("Age: " + age);
            System.out.println("Weight: "+ weight+" kg");
            System.out.println("Hemoglobin: " + hemoglobin + "g/dL");

            if((age >=18 && age <=65) && (weight >=50) && (hemoglobin>=12.5)){
                System.out.println("Status: Eligible");
                sum++;
            }
            else{
                if(!(age >=18 )){
                     System.out.println("Status: Not Eligible");
                    System.out.println("Reason: Age Below 18 Years");
                }
                else if(!(age <=65 )){
                     System.out.println("Status: Not Eligible");
                    System.out.println("Reason: Age Above 65 Years");
                }
                else if(!(hemoglobin>=12.5)){
                    System.out.println("Status: Not Eligible");
                    System.out.println("Reason: Hemoglobin below 12.5 g/dL");
                }
                 else if(!(weight >=50)){
                    System.out.println("Status: Not Eligible");
                    System.out.println("Reason: Weight below 50 kg");
                }   
                rej++;
            }
            
            System.out.println();
        }
        System.out.println("Total Donors: " + n);
        System.out.println("Eligible Donors: " + sum);
        System.out.println("Rejected Donors: " + rej);

        double eligibleRate = ( sum / n) * 100;
        System.out.println("Eligibility Rate: " + eligibleRate + " %");


    }
}
