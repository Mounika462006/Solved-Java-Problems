import java.util.Scanner;

public class dowhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temperature = sc.nextInt();

        do{
            if(temperature >=50){
                System.out.println("Invalid");
            }
            else{
                System.out.println("Valid");
                break;
            }
            temperature = sc.nextInt();
        }while(temperature<=50);

    }
}
