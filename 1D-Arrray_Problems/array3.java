import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double []arr = new double[n];
       
        double sum=0.0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
            
        }
        System.out.println("Number of Readings: "+ n);

        double max = arr[0];
        for(int i=1;i<n;i++){
             if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.printf("Maximum Temperature: %.2f C\n", max);

        double min = arr[0];
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.printf("Minimum Temperature: %.2f C\n" ,min);
        
        double range = max - min;
        System.out.printf("Temperature Range: %.2f C\n",range);
        
        double  avrg = sum / n ;
        System.out.printf("Average Temperature: %.2f C\n" , avrg);
    }
}
