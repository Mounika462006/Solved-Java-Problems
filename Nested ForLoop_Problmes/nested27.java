import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val =1;
        for(int i=1; i<=n;i++){
            for(int k=1; k<=n-i;k++){
                System.out.printf("    ");
            }
            for(int l=1; l<=i;l++){

                System.out.printf("%3d ",val);
                val++;
            }
            System.out.print("\n");
        }
    }
}
