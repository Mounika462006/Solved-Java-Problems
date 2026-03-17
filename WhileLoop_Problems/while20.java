import java.util.Scanner;

public class while20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        int i = num;
        while(i >0){
            int  temp = i % 10;
            int mul=1;

            for( int fact = temp ; fact > 0; fact--){
                    mul = mul*fact;
            } 
            sum= sum+mul;
            i=i/10;
        }
        if(num == sum){
            System.out.println(num + " is a strong number");
        }
        else{
            System.out.println(num + " is a not strong number");
        }
    }
}
