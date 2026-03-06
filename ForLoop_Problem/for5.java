import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        double sum=0;
        String status =" ";
        double max =0.0;
        int index =0;
        int count =0;

        for(int i=1;i<=n;i++){
            int contains = sc.nextInt();
            int roomOccupied = sc.nextInt();
            int totalRoom = sc.nextInt();

            System.out.println("Day: " + contains);
            System.out.println("Rooms Occupied: " + roomOccupied);
            System.out.println("Total Rooms: " + totalRoom);

            double occupancyRate =( roomOccupied * 100.0) / totalRoom;

            System.out.printf("Occupancy Rate: %.1f%%\n",occupancyRate);

            sum=sum+occupancyRate;

            if(occupancyRate == 100){
                status ="Full";
            }
            else if(occupancyRate>=80 && occupancyRate<=99){
                status="High";
            }
            else if(occupancyRate>=60 && occupancyRate<=79){
                status ="Moderate";
            }
            else if(occupancyRate<60){
                status = "Low";
            }
            System.out.println("Status: " + status);

           if(occupancyRate> max){
                max = occupancyRate;
                index = contains;
           }

           if(status.equalsIgnoreCase("Full")){
            count++;
           }
            System.out.println();
        }
        System.out.println("Total Days Analyzed: " + n);
        System.out.printf("Average Occupancy Rate: %.1f%%\n",sum/n);
        System.out.println("Peak Occupancy Day: Day"+index);
        System.out.println("Days at Full Capacity: "+count);
    }
}
