import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b= sc.nextInt();
        int area = l*b;
        int per = 2*(l+b);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + per);
    }
}
