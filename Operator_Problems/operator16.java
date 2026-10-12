import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String empid = sc.nextLine();
        short  hours = sc.nextShort();
        int  received = sc.nextInt();
        System.out.println("Employee's ID = "+ empid);
        double total = hours * received;
        System.out.printf("Salary = Rs. %.2f", total);
    }
}
