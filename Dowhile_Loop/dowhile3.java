import java.util.Scanner;

public class dowhile3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         
        int fuel = sc.nextInt();
        int sum =0;
        do{
            sum = sum + fuel;
            fuel = sc.nextInt();

        }while(fuel != 0);
        System.out.println("Total: " + sum);
    }
}