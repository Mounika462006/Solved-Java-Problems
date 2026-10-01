import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextLong();
        }
        long max=0;
        for(int i=0; i<n;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        long second_max=0;
        for(int i=0 ; i<n;i++){
            if(second_max < arr[i]  && arr[i] != max){
                second_max = arr[i];
            }
        }
        System.out.print(second_max);
    }
}
