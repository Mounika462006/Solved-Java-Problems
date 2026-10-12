import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int age = sc.nextInt();
        int month = age * 12;
        System.out.println("Ages in Months: "+month);
        int day = age * 365;
        System.out.println("Ages in Days: "+day);
        long hour = age * 365 * 24;
        System.out.println("Ages in Hours: "+ hour);
        long sec = age * 365 * 24 * 3600;
        System.out.println("Ages in Seconds: "+ sec);
        
    }
}
