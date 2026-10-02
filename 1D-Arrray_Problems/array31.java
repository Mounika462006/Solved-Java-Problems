import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        int max=0;
       for(int j=0; j<n; j++){
            if(arr[j]>0){
                count++;
            }
            else{
                if(max<count){
                    max = count;
                }
                count=0;
            }

       }
       System.out.print(max);

    }
}
