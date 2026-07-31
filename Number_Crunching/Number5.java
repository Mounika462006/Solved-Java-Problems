import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count =0;
        while(n>0){
            long temp = n % 10;
            count++;
            n=n/10;
        }
        if(count == 7){
            System.out.print("1000000");
        }
        
        else if(count==6){
            System.out.print("100000");
        }
         else if(count==5){
            System.out.print("10000");
        }
         else if(count==4){
            System.out.print("1000");
        }
         else if(count==3){
            System.out.print("100");
        }
         else if(count==2){
            System.out.print("10");
        }
         else if(count ==1){
            System.out.print("1");
        }
    }
}
