import java.util.Scanner;

public class for18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totalTemp = 0;
        double maxTemp = -1000;
        double minTemp = 1000;

        int maxHour = 0;
        int minHour = 0;

        int hotHours = 0;
        int coldHours = 0;

        for(int i = 1; i <= n; i++){

            int hour = sc.nextInt();
            double temperature = sc.nextDouble();

            totalTemp += temperature;

            System.out.println("Hour " + hour + ": " + temperature + "°C");

            String status;

            if(temperature > 40 || temperature < 0){
                status = "Extreme";
            }
            else if(temperature >= 32 && temperature <= 40){
                status = "Hot";
            }
            else if(temperature >= 0 && temperature <= 10){
                status = "Cold";
            }
            else{
                status = "Normal";
            }

            System.out.println("Status: " + status);
            System.out.println();

            if(temperature > maxTemp){
                maxTemp = temperature;
                maxHour = hour;
            }

            if(temperature < minTemp){
                minTemp = temperature;
                minHour = hour;
            }

            if(temperature >= 32){
                hotHours++;
            }

            if(temperature <= 10 && temperature >= 0){
                coldHours++;
            }
        }

        double average = totalTemp / n;

        System.out.println("Total Readings: " + n);
        System.out.printf("Average Temperature: %.2f°C\n", average);
        System.out.println("Highest Temperature: " + maxTemp + "°C at Hour " + maxHour);
        System.out.println("Lowest Temperature: " + minTemp + "°C at Hour " + minHour);
        System.out.println("Hot Hours: " + hotHours);
        System.out.println("Cold Hours: " + coldHours);

    }
}