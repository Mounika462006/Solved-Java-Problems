import java.util.Scanner;

public class ifelse19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String movieFormat = sc.nextLine();
        String showTime = sc.nextLine();
        String seatCategory = sc.nextLine();
        String customerType = sc.nextLine();

        System.out.println("Movie Format: " + movieFormat);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Category: " + seatCategory);
        System.out.println("Cusomer Type: " + customerType);
        System.out.println("Base ticket price: $12.0");

        double formatSurcharge = 0.0;
        if(movieFormat.equalsIgnoreCase("2D")){
            formatSurcharge = 0;
        }
        else if(movieFormat.equalsIgnoreCase("3D")){
            formatSurcharge = 5;
        }
        else if(movieFormat.equalsIgnoreCase("IMAX")){
            formatSurcharge= 8;
        }
        else if(movieFormat.equalsIgnoreCase("4DX")){
            formatSurcharge = 10;
        }
        System.out.printf("Format Surcharge: $%.1f\n",formatSurcharge);

        double seatUpgrade = 0.0;
        if(seatCategory.equalsIgnoreCase("Standard")){
            seatUpgrade = 0;
        }
        else  if(seatCategory.equalsIgnoreCase("Premium")){
            seatUpgrade = 4;
        }
        else  if(seatCategory.equalsIgnoreCase("Recliner")){
            seatUpgrade = 7;
        }
        System.out.printf("Seat Upgrade Fee: $%.1f\n",seatUpgrade);

        int timeBased = 0;
        if(showTime.equalsIgnoreCase("Matinee")){
            timeBased = -30;
        }
        else if(showTime.equalsIgnoreCase("Evening")){
            timeBased = 0;
        }
        else if(showTime.equalsIgnoreCase("Prime-Time")){
            timeBased = 20;
        }
        else if(showTime.equalsIgnoreCase("Late-Night")){
            timeBased = -20;
        }
        System.out.println("Time-Baed Adjustment: " + timeBased +"%");

        double customerDis = 0.0;
        if(customerType.equalsIgnoreCase("Adult")){
            customerDis = 0;
        }
        else if(customerType.equalsIgnoreCase("Senior")){
            customerDis = 25;
        }
        else if(customerType.equalsIgnoreCase("Student")){
            customerDis =15;
        }
        else if(customerType.equalsIgnoreCase("Child")){
            customerDis =30;
        }
        System.out.println("Customer Discount: " + customerDis + "%");

        double baseWithSurcharges = 12.0 + formatSurcharge + seatUpgrade;

        double adjustedPrice = baseWithSurcharges * ( 1+ timeBased /100.0);

        double finalprice = adjustedPrice * (1 - customerDis /100.0);

        System.out.printf("Final Ticket Price: $%.1f\n",finalprice);

        String str =" ";
        if(showTime.equalsIgnoreCase("Matinee") ||
        customerType.equalsIgnoreCase("Senior") ||
        customerType.equalsIgnoreCase("Student") ||
        customerType.equalsIgnoreCase("Child")
        ) {
            str = "Yes";
        } 
        else {
            str ="NO";
        }
        System.out.println("Concession Voucher: " + str);

        String price = " ";

        if(finalprice<20){
            price =" Value";
        }
        else if(finalprice >=20 && finalprice<=29){
            price ="Premium";
        } 
        else if(finalprice >=30){
            price = " Luxury";
        }
        System.out.println("Pricing Category: " + price);
       
        

        





    }   

}
