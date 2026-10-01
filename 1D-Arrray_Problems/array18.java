import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        int mid = n /2;
        for(int i=0; i<mid; i++){
            System.out.print(arr[i]+ " ");
        }
        for(int i= n-1; i>=mid; i--){
            System.out.print(arr[i] +" ");
        }
    }
}
