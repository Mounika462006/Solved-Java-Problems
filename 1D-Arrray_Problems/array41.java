import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        boolean check = true;
        for(int j=0; j<n-1; j++){
            if(Math.abs( arr[j]-arr[j+1] )!=diff){
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
