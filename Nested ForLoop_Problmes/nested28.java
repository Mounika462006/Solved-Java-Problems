import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i =1; i<=n;i++){
            int i_dup =n;
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i_dup);
                i_dup--;
            }
            System.out.print("\n");
        }
    }
}
