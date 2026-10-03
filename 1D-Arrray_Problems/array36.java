import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++){
            boolean res=false;

            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    res=true;
                    break;
                }
            }
            if(res){
                continue;
            }
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+":"+count);
        }
    }
}
