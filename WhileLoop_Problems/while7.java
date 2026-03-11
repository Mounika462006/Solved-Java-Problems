import java.util.Scanner;

public class while7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do{
            System.out.println(" ====  Calculator Menu ====");
            System.out.println("1. Addition (+) ");
            System.out.println("2. Subraction (-) ");
            System.out.println("3. Multiplication (*) ");
            System.out.println("4. Division (/) ");
            System.out.println("5. Exit");
            System.out.println("Choose the choice : 1 - 5");

            choice = sc.nextInt();

            if(choice >=1 && choice <= 4){
                System.out.println("Enter the number 1: ");
                double num1 = sc.nextDouble();
                System.out.println("Enter the number 2: ");
                double num2 = sc.nextDouble();
                double res = 0.0;
                switch (choice) {
                    case 1:
                        res = num1 + num2;
                        System.out.printf(" %.2f +  %.2f = %.2f\n", num1 , num2, res);
                        break;
                    
                    case 2:
                        res = num1 - num2;
                        System.out.printf(" %.2f -  %.2f = %.2f\n", num1 , num2, res);
                        break;
                    case 3:
                        res = num1 * num2;
                        System.out.printf(" %.2f *  %.2f = %.2f\n", num1 , num2, res);
                        break;
                    case 4:
                        if(num2 != 0){
                            res = num1 / num2;
                            System.out.printf(" %.2f /  %.2f = %.2f\n", num1 , num2, res);
                        }
                        else{
                            System.out.println("\n Error Dividing by zero");
                        }
                         break;
                    case 5:
                        System.out.println("Good Bye!");
                    
                }
            }
            else if(choice != 5){
                System.out.println("Invalid Input");
            }
        }while(choice != 5);
        
    }
}
