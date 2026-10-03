import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }

        for(int j=0; j<n-1; j++){
            if(arr[j]==arr[j+1]){
                arr[j]= arr[j] * 2;;
                arr[j+1] =0;
            }
        }
       int l =0;

       for(int m=0; m<n; m++){
          if(arr[m]!=0){
            arr[l] = arr[m];
            l++;
          }
       } 
        while(l<n){
        arr[l] =0;
        l++;
       }


       for(int x=0; x<n; x++){
        System.out.print(arr[x]+" ");
       }
    }
}
