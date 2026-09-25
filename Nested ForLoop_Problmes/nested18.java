import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            
            for(int j=i*2-1; j<=n*2-1; j=j+2){
                System.out.print(j);
            }
            System.out.print("\n");
            
        }
    }
}
