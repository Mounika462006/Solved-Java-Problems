import java.util.Scanner;

public class for9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int burned = 0;
        int duration =0;    
        int totalCalories =0;
        String fitness = " ";

        for(int i=1;i<=n;i++){
            String workout = sc.next();
            int min = sc.nextInt();


            System.out.println("Session "+ i +": " + workout);
            System.out.println("Duration: " + min+" minutes");

            if(workout.equalsIgnoreCase("Running")){
                burned = 10 * min;
                System.out.println("Intensity: High");
            }
            else if(workout.equalsIgnoreCase("Swimming")){
                burned = 12 * min;
                System.out.println("Intensity: High");
            }
            else if(workout.equalsIgnoreCase("Cycling")){
                burned = 8* min;
               System.out.println("Intensity: Moderate");

            }
            else if(workout.equalsIgnoreCase("Gym")){
                burned = 7 * min;
                System.out.println("Intensity: Moderate");

            }
            else if(workout.equalsIgnoreCase("Walking")){
                burned = 4 * min;
                System.out.println("Intensity: Low");

            }
            System.out.println("Calories Burned: " + burned);

           duration = duration+ min;
           totalCalories = totalCalories + burned;

           if(totalCalories <300){
            fitness ="Beginner";
           }
           else if(totalCalories >=301 && totalCalories <=1000){
            fitness = " Intermediate";
           }
           else if(totalCalories >=1001){
            fitness = "Advanced";
           }
           System.out.println();
        }

        System.out.println("Total Workouts: " + n);
        System.out.println("Total Duration: " + duration +" minutes");
        System.out.println("Total Calories Burned: " + totalCalories);
        double avrg = totalCalories / n;
        System.out.printf("Average Calories Per Session: %.1f\n",avrg);
        System.out.println("Fitness Level: " + fitness);
    }
}
