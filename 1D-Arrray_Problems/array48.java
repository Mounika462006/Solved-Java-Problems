import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 =new int[n1];
        int[] arr2 = new int[n2];

        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        for(int j=0; j<n2; j++){
            arr2[j] = sc.nextInt();
        }

        for(int k=0; k<n1; k++){
            boolean check = false;
            for(int l =0; l<n2; l++){

                if(arr1[k] == arr2[l]){
                    check = true;
                }
            }
            if(!check){
                System.out.print(arr1[k] +" ");
            }
        }
    }
}
