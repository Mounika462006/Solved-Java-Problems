import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum =0;
        int count =0;
        int i =1;
        while (i<=n) {
            int num = sc.nextInt();
            if(num !=0 ){
                System.out.println("Enter number (0 to Stop): " + num );
                sum = sum + num;
                count++;
            }
            else{
                break;
            }
            i++;
        }
        System.out.println("Total sum: " + sum);
        System.out.println("Count: "+ count);
        
    }
}
