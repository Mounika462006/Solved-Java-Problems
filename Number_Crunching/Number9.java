import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n= sc.nextInt();
        long add =0;
        
        while(n>0){
            long temp = n%10;
            long count =0;
            for(long i=1; i<=temp;i++){
                if(temp %i==0){
                    count++;
                }
            }
            if(count ==2){
                add++;
            }
            n=n/10;
        }
        System.out.print(add);
    }
}
