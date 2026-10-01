import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextLong();
        }
        long sum = arr[0] + arr[arr.length-1];
        System.out.print(sum);
    }
}
