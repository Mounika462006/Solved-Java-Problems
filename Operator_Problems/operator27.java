import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int day = sc.nextInt();
        int year_div = day/365;
        System.out.println("Years: " + year_div);
        
        int year_rem = day % 365;
        int week_div = year_rem/7;
        System.out.println("Weeks: " + week_div);
        
        int week_rem= year_rem % 7;
        System.out.println("Days: " + week_rem);
        
        
        
    }
}
