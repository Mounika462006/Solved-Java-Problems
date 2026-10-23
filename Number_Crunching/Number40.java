import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int val = 1;
        for(int i=1; i<=b;i++){
            val = val * a;
        }
            int temp = 1;
            for(int i=1;i<=k;i++){
                temp = val % 10;
                 val = val/10;
            }
            System.out.print(temp);
           
        
        
    }
}
