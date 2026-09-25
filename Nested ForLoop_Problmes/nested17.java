import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1; j<=i*2-1; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
