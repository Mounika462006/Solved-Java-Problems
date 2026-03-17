import java.util.Scanner;

public class while21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        System.out.println("Multiplication of table of 5 " );

        do{
            int a =5;
            System.out.println(" 5 x "+ i + " = " + a * i);
            i++;


        }while(i<=10);
    }
}
