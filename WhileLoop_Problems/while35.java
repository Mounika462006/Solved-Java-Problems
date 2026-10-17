import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        long a =sc.nextLong();
        long b = sc.nextLong();
        long pos = sc.nextLong();
        long count =0;
        for(long i = 1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                count++;
            }
            if(count == pos){
                System.out.print(i);
                break;
            }
            
        }
    }
}
