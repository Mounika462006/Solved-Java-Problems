import java.util.*;

public class array4{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int thershold = sc.nextInt();
        int []arr = new int[n];
        int count =0;
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            
        }
        for(int i=0;i<n;i++){
            if(thershold>arr[i]){
                count++;

            }
        }
        int []indics = new int[count];
        int j=0;
        for(int i=0;i<n;i++){
            if(thershold > arr[i]){
                indics[j] =i;
                j++;
            }
        }
        System.out.println("Total Products: "+ n);
        System.out.println("Minimum Threshold: "+ thershold);
        System.out.println("Low Stock Products: " + count);
        System.out.println("Product Indices: ");
        for(int i=0; i < count;i++){
            System.out.println(indics[i] + " ");
        }
    }
}