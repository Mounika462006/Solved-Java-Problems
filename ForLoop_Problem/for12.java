import java.util.Scanner;

public class for12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        double hoursRte = 0.0;
        double revenueFee = 0.0;
        int count =0;

        for(int i=1;i<=n;i++){
            String vechType = sc.next();
            double hourParked = sc.nextDouble();


            System.out.println("Vehicle " + i + " : "  + vechType);
            System.out.println("Hours Parked: " + hourParked);

            if(vechType.equalsIgnoreCase("Car")){
                hoursRte = 3;
                
            }
            else if(vechType.equalsIgnoreCase("Motorcycle")){
                hoursRte = 2;
            }
            else if(vechType.equalsIgnoreCase("Truck")){
                hoursRte = 5;
            }
            else if(vechType.equalsIgnoreCase("Bus")){
                hoursRte = 7;
            }
            
            System.out.println("Hourly Rate: $" + hoursRte);

            double fees = hourParked * hoursRte;
            

            if(vechType.equalsIgnoreCase("Car")){
                if(fees > 30){
                    fees = 30;
                   System.out.println("Cap Applied: Yes");
                }
                else{
                   System.out.println("Cap Applied: No");

                }
            }
            else if(vechType.equalsIgnoreCase("Motorcycle")){
                if(fees > 20){
                    fees = 20;
                   System.out.println("Cap Applied: Yes");
                }
                else{
                   System.out.println("Cap Applied: No");

                }
            }
            else if(vechType.equalsIgnoreCase("Truck")){
                if(fees >60){
                    fees =60;
                   System.out.println("Cap Applied: Yes");
                }
                else{
                   System.out.println("Cap Applied: No");

                }
            }
            else if(vechType.equalsIgnoreCase("Bus")){
                if(fees > 100){
                    fees = 100;
                   System.out.println("Cap Applied: Yes");
                }
                else{
                   System.out.println("Cap Applied: No");

                }
            }
        
            System.out.println("Parking Fee:$" + fees);

            revenueFee = revenueFee + fees;

            if(hourParked> 8){
                count++;
            }
            System.out.println();

        }
        System.out.println("Total Vehicles: "+ n);
        System.out.printf("Total Revenue:$%.1f\n",revenueFee);
        
        double avrg = revenueFee / n;
        System.out.printf("Average Fee:$%.1f\n",avrg);
        System.out.println("Peak Hour Vehicles (>8 hours): " + count);
    }
}
