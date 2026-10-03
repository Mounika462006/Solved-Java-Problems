import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean check=true;
        for(int j=1; j<n; j++){
            if(arr[j]-arr[j-1] !=1){
                check = false;
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
