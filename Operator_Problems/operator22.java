import java.util.*;
public class Main{
    public static void main(String[] String){
        Scanner sc=  new Scanner(System.in);
        float distance = sc.nextFloat();
        
       
        
        float Kilometers =distance*1.60934f;
        float meter= Kilometers * 1000;
        float Centimeter =meter * 100;
        
        System.out.printf("Kilometers: %.5f\n", Kilometers);
        System.out.printf("Meters: %.2f\n", meter);
        System.out.printf("Centimeters: %.1f\n",Centimeter);
        
    }
}
