import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int val=1;
        for(int i=1; i<=n;i++){

            for(int j=1; j<=i;j++){
                System.out.print(val);
                val++;
            }
            int temp = val-2;
            for(int j= i+1; j<=2*i-1; j++){
                System.out.print(temp);
                temp--;
            }
            System.out.print("\n");
        }
    }
}
