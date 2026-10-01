import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        for(int i=0; i<n; i++){
            long sum =0;
            for(int j=i-1; j>=0; j-- ){
                sum = sum+ arr[j];
            }
            System.out.print(sum + " ");
        }
    }
}
