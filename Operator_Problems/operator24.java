import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double l=sc.nextDouble();
        double w=sc.nextDouble();
        double h=sc.nextDouble();
        double p=sc.nextDouble();
        double s=sc.nextDouble();
        double area=(2*l*h)+(2*w*h);
        int gallons=(int)((area/s)+0.9999);
        double cost=gallons*p;
        System.out.printf("Total Cost: %.2f\n",cost);
        
    }
}
