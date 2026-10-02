import java.util.*;
public class Main{
    public static  void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int j=0; j<n; j++){
            int a=0; 
            int b=1;

            while(a<arr[j]){
                int c = a+b;
                a=b;
                b=c;
            }

            if(a == arr[j]){
                if(a<min){
                    min=a;
                }
                if(a>max){
                    max =a;
                }
            }
        }
        System.out.print(min +" "+ max);
    }
}
