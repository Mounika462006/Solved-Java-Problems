import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int diff = sc.nextInt();
        int count=0;
        for(int j=0; j<n-1; j++){
            for(int k = j+1; k<n; k++)
            if(Math.abs(arr[j] - arr[k]) == diff){
                count++;
            }
        }
        System.out.print(count);
    }
}
