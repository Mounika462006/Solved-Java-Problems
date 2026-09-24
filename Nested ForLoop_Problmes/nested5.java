import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        for(int i=1; i<=n;i++){     
            for(int j=1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
