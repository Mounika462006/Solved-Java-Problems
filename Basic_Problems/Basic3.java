import java.util.Scanner;
public class Basic3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double sales=sc.nextDouble();
        double discount=sc.nextDouble();
        double gst = sc.nextDouble();

        double  amunt = (sales*discount/100);
        double per = sales-amunt;
        double reduce = (per*gst/100);
        double last = per+reduce;
        System.out.printf("Final Revenue = %.0f",last);

    }
    
}
