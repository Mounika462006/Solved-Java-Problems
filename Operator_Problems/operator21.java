import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        double distance = sc.nextDouble();
        double Yards = distance * 1760.0;
        double Feet=distance *  5280.0;
        double Inches =distance * 63360.0;
        System.out.printf("Yards: %.1f\n", Yards);
        System.out.printf("Feet: %.1f\n", Feet);
        System.out.printf("Inches: %.1f\n", Inches);
        
    }
}
