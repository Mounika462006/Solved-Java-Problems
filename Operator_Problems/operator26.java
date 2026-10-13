import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double f=sc.nextDouble();
        double val = 5/9.0;
        double c =val*(f-32);
        System.out.printf("%.2f",c);

    }
}
