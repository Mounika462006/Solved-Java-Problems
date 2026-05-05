import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double []arr= new double[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
        }

        double min = arr[0];
        for(int i=0;i<n;i++){
            if(min> arr[i]){
                min = arr[i];
            }
        }


        double max = 0;
        for(int i=0;i<n;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        double diff = max - min;

        double saving = (max - min ) / max * 100.0;
        System.out.println("Number of Sellers: "+ n);
        System.out.printf("Lowest Price: $ %.2f\n" , min);
       System.out.printf("Highest Price: $ %.2f\n" , max);
        System.out.printf("Price Difference: $ %.2f\n",diff);
        System.out.printf("Savings: %.2f %%\n" , saving);
    }
}
