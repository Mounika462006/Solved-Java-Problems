import java.util.Scanner;

public class nested2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Multiplication Table (" + row + "*" + col + "):");
        
        for(int i=1;i<=col;i++){
           System.out.print( i +  " ");
        }
        System.out.println();

        for(int i=1;i<=row;i++){
            
            System.out.print(i + " ");
            for(int j=1;j<=col;j++){
                int mul = i*j;
                System.out.print(mul + " ");
            }
            System.out.println();
           
        }
    }    
}
