import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        double R = sc.nextDouble();
        double week = H*R;
        double  month = (H*R*52) / 12;
        double annual = H*R*52;
        System.out.printf("Weekly Gross Pay: %.1f\n",week);
        System.out.printf("Monthly Gross Pay: %.1f\n", month);
        System.out.printf("Annual Gross Pay: %.1f\n", annual);
    }
}
