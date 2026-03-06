import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        double recorder = 0.0;
        double total = 0.0;
        String status = " ";
        int count =0;
        int add=0;

        for(int i=1;i<=n;i++){
            String prodtName = sc.next();
            int currentStock = sc.nextInt();
            int miniumstock = sc.nextInt();
        
            System.out.println("Products: " + prodtName);
            System.out.println("Current Stock: " + currentStock);
            System.out.println("Minimum Stock: " + miniumstock);

            if(currentStock>=miniumstock){
                status ="Adequate";
            }
            else if(currentStock< miniumstock && currentStock>= miniumstock/2){
                status = "Low Stock";
            }
            else if(currentStock < miniumstock/2){
                status ="Critical";
            }
            System.out.println("Status: " + status);

            if(status.equalsIgnoreCase("Adequate")){
                recorder =0;
            }
            else if(status.equalsIgnoreCase("Low Stock")){
                recorder = (miniumstock - currentStock ) + miniumstock /2;
            }
            else if(status.equalsIgnoreCase("Critical")){
                recorder = (miniumstock - currentStock ) + miniumstock * 1.5;
            }

            System.out.printf("Reorder Quantity: %.0f\n",recorder);
            System.out.println();
            total = total+ recorder;

            if(status.equalsIgnoreCase("Low Stock")){
                count++;
            }
            else if(status.equalsIgnoreCase("Critical")){
                add++;
            }
        }
        System.out.println("Total Products: "+ n);
        System.out.println("Low Stock Items: " + count);
        System.out.println("Critical Items: " + add);
        System.out.printf("Total Reorder Quantity: %.0f" ,total);
    }
}
