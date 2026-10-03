import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        int count=1;
        for(int j=1; j<n; j++){
            boolean check = true;
            for(int k=0; k<j;k++){
                if(arr[j] <= arr[k]){
                     check = false;
                     break;
                }
            }
            if(check){
                count++;
            }
        }
        System.out.print(count);
    }

}
