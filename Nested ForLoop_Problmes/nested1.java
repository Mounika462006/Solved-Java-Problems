import java.util.Scanner;

public class nested1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Seating Arrangement");
        for(int i=1; i<=row ;i++){
            System.out.print("Row " + i + ": ");
            for(int j=1;j<=col;j++){
                
                System.out.print(" Seat -" + j);
            }
            System.out.println("\n");
        }
    }
}
