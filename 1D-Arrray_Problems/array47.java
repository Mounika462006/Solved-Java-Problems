import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] arr1= new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n3];

        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int j=0; j<n2; j++){
            arr2[j] = sc.nextInt();
        }
        for(int k=0; k<n3; k++){
            arr3[k] = sc.nextInt();
        }

        int target = sc.nextInt();

        boolean check = false;

        for(int l=0; l<n1; l++){
            for(int m=0; m<n2; m++){
                for(int n =0; n<n3; n++){
                    if(arr1[l] + arr2[m] + arr3[n] == target){
                        System.out.print(arr1[l] +" "+arr2[m]+" " +arr3[n]);
                        check = true;
                        
                    }
                    break;
                    
                }
            }
        }
        if(!check){
            System.out.print("No such triplets");
        }
    }
}
