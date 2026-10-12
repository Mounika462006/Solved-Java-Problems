import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double rad = sc.nextDouble();
    double pi = 3.14159;
    double circle = pi *rad *rad;
    System.out.printf("Area of a Circle: %.5f\n", circle);
    
    double l = sc.nextDouble();
    double w = sc.nextDouble();
    double rec = l * w;
    System.out.printf("Area of a Rectangle: %.1f\n",rec);
    
    double b = sc.nextDouble();
    double h = sc.nextDouble();
    double tri = 0.5 * b * h;
    System.out.printf("Area of a Triangle: %.1f\n",tri);
    }
}
