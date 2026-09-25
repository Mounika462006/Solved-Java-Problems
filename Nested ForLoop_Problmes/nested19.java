import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=count;j++){
                if(i==1){
                     System.out.print(1);
                }
                else{
                   System.out.print(j);
                }
                
            }
            count= count+2;
            System.out.print("\n");
        }
    }
}
