import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val=1;

        for(int i=1; i<=n;i++){
            for(int j=i; j<=n;j++){
                System.out.print(j);
            }
            for(int k=i-1; k>=1; k--){
                System.out.print(k);
            }
            System.out.print("\n");
        }
    
    }
}
