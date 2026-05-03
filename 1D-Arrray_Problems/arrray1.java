import java.util.*;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfEmployee = sc.nextInt();

        double [] array = new double[numberOfEmployee];
        double sum =0.0;
        for(int i=0; i< numberOfEmployee; i++){
            array[i] = sc.nextDouble();
            sum += array[i];
        }
        
        double avrg = sum / numberOfEmployee ;
       

        int count =0;
         for(int i=0; i< numberOfEmployee; i++){
            if(avrg < array[i]){
                count++;
            }
        }

        double percent = (count *100.0) /numberOfEmployee;

        System.out.println("Total Employee: " + numberOfEmployee);

        System.out.printf("Average Salary: %.2f\n" ,avrg);
        
        System.out.println("Employees Above Average: " + count);
        
        System.out.printf("Percentage: %.2f %%\n" , percent);

    }
}
