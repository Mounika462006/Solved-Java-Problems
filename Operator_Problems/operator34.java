import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        
        int total = s1 + s2 + s3;
        System.out.println("Total Marks: " + total);
        double avrg  = total / 3.0;
        System.out.printf("Average Marks: %.2f" ,avrg);
    }
}
