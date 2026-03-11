import java.util.Scanner;

public class while13 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int base = sc.nextInt();
       int exponent = sc.nextInt();
        int result =1;
       int i=1;
       while(i<=exponent){
        result =  (base * result);
        i++;
        }
        System.out.println(base + " ^ " + exponent +  " = " + result);
    }
}
