import java.util.Scanner;

public class for11 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        double baseprice = 0.0;
        int discount =0;
        double finalTotal=0.0;
        double orgTotal =0.0;
        double finalprice =0.0;
        double a =0.0;

        for(int i=1;i<=n;i++){
            String seatType = sc.next();
            String customeType = sc.next();

            System.out.println("Ticket " + i +" : " + seatType + " - " + customeType );

            if(seatType.equalsIgnoreCase("Regular")){
                baseprice = 12;
            }
            else if(seatType.equalsIgnoreCase("Premium")){
                baseprice = 18;
            }
            else if(seatType.equalsIgnoreCase("Recliner")){
                baseprice = 25;
            }

            System.out.printf("Base Price: $%.1f\n",baseprice);

            if(customeType.equalsIgnoreCase("Adult")){
                discount = 0;
            }
            else if(customeType.equalsIgnoreCase("Child")){
                discount = 30;
            }
            else if(customeType.equalsIgnoreCase("Senior")){
                discount = 25;
            }

            System.out.println("Discount: " + discount +"%");

             finalprice = baseprice * (1-discount/100.0);
            System.out.printf("Final Price: $%.1f\n",finalprice);
            
            orgTotal = orgTotal + baseprice;
            finalTotal= finalTotal+finalprice;
            System.out.println();
        }

        System.out.println("Total Tickets: " + n);
        System.out.printf("Original Total: $%.1f\n",orgTotal);
        System.out.printf("Final Total: $%.1f\n",finalTotal);

        if(n>=5){
             a = finalTotal * 0.10;
             System.out.println("Group Discount Applied: Yes");
        }
        else{
             a = finalTotal;
              System.out.println("Group Discount Applied: No");

        }
        double total = orgTotal - a;
        System.out.printf("Total Discount: $%.1f\n" , total);
    }
}
