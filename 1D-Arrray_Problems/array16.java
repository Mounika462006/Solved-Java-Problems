import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextLong();
        }
        
        for(int i = arr.length -1 ; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
