import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();
        String rev ="";
        int quo =0;
        while(num>0){
            int temp = num % base;
            
            if(temp<=10){
                temp= temp+quo;
                quo=0;
            }
            else if(temp >10){
                int rem = temp % 10;
                quo = temp / 10;
                temp=rem;

            }
            rev = temp + rev;
            num = num / base;
        } 
        System.out.print(rev);
 
    }
}
