import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextLong();
        }
        int count=0;
        for(int j=0; j<n; j++){
            for(int k=j+1; k<n; k++){
                if(arr[j] > arr[k]){
                    System.out.println(arr[j] +" " + arr[k]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
