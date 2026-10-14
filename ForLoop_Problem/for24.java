import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long base =sc.nextLong();
        long expo = sc.nextLong();
        
        long mul =1;
        for(long i=1; i<=expo; i++){
               mul =base*mul;
        }
        System.out.print(mul);
    }
}
