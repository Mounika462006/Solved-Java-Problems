import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            for(int k=1; k<=2*(n-i)-1;k++){
                System.out.print("0");
            }
            if(i == n) {
                for(int l = i - 1; l >= 1; l--) {
                    System.out.print(l);
                }
            }
            else {
                for(int l = i; l >= 1; l--) {
                    System.out.print(l);
                }
            }

            System.out.print("\n");
        }
    }
}
