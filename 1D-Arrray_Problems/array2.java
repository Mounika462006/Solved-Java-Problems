import java.util.*;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        int max =0;
        int count =0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(max<arr[i]){
                max = arr[i];
            }
            if(arr[i]<40){
                count++;
            }
        }
        System.out.println("Total Students: " + n);
        System.out.println("Highest Score: " + max);

        int min= arr[0];

        for(int i=0;i<n;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Lowest Score: " + min);
        System.out.println("Failed Students: "+ count);

        int pass = n - count;
        double percent = (pass * 100.0) / n ;
        System.out.printf("Pass Percentage: %.2f %%" ,percent );
    }
}
