import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max =0;
        for(int j=0; j<n; j++){
            boolean check = false;
            for(int k=0; k<j; k++){
                if(arr[j] == arr[k]){
                    check = true;
                    break;
                }
                
            }
            if(check){
                continue;
            }

            for(int l=j+1; l<n; l++){
                if(arr[j] == arr[l]){
                    int temp = (l-j)+1;
                    if(temp>max){
                        max = temp;
                        break;
                    }
                }
            }
        }
        System.out.print(max);
    }
}
