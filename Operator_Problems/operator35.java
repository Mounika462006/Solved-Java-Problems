import java.util.*;
public class Main{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        
        double inch = h / 2.54;
        int feet = (int)inch / 12;
        double bal = inch % 12;
        System.out.printf("Height in feet and inches: %d' %.1f\"", feet, bal);
    }
}
