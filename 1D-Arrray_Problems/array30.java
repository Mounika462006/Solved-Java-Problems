import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum = sc.nextInt();
        boolean check = false;

        for(int j=0; j<n-1; j++){
            for(int k=j+1; k<n; k++){
                if((arr[j] + arr[k]) == sum){
                    check = true;
                }
               
            }
            if(check){
                break;
            }
        }
        if(check){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
