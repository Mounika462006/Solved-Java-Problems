import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int scret = sc.nextInt();
        int guess = 0;
        int count =0;

        while (guess != scret) {
             guess  = sc.nextInt();
            count++;
            System.out.println("Guess the number (1-100): " + guess);
           

            if(guess< scret){
                System.out.println("Too low!");
            }
            else if(guess > scret){
                System.out.println("Too high!");
            }
           else{
            System.out.println("Correct!");
            System.out.println("Attempts: " + count);

           }

        }
    }
}
