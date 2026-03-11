import java.util.Scanner;

public class while12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int rev =0;
        int i = num;
        while( i != 0){
            int temp = i % 10;
            rev = (rev * 10) + temp;
            i/=10;
        }
        if(rev == num){
            System.out.println( num + " is a palindrome");
        }
        else{
            System.out.println( num + " is not a palindrome");
        }
    }
}
