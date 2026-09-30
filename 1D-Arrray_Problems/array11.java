import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        long min = arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.print(min);
    }
}
