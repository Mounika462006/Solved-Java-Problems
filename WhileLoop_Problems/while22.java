import java.util.Scanner;

public class while22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum =0;
        int i = start;
        while (i<=end) {
            if(i % 2==0){
                sum= sum+i;
            }
            i++;
        }
        System.out.println("Sum of even numbers from " + start + " to " + end + " : " + sum);
    }
}
