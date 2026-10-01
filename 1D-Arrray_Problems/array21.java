import java.util.*;
public class Main{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long even =0;
        long odd=0;
        for(int i=0; i<n;i++){
            arr[i] = sc.nextLong();
            if(arr[i] % 2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.print(odd + " "+ even);
    }
}
