import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int add=0;
        for(int j =0; j<n; j++){
            int sum = 0;
            for(int k=0; k<=j; k++){
                sum = sum + arr[k];
            }
            int count=0;
            for(int l=1; l<=sum; l++){
                if( sum % l ==0){
                    count++;
                }
            }
            if(count==2){
                add++;
            }


        }

        System.out.print(add);
        
    }
}
