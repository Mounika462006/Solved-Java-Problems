import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val =1;
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.printf("%2d ",val);
                val++;
            }
            System.out.print("\n");
        }
    }
}
