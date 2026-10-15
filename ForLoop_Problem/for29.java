import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long flag =0;
        
        for(long i=1;i<=n ;i++){
            if(i*i==n){
                flag =1;
                break;
            }
            else{
                flag =0;
            }
        }
        
        if(flag==1){
            System.out.print("Yes");
        }
        else{
                System.out.print("No");
            }
    }
}
