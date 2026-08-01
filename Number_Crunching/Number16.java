import java.util.*;
public  class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long org =n;
        long last =n;
        long count  =0;
        while(n!=0){
            long temp = n%10;
            count++;
            n=n/10;
        }
        
        long sum =0;
        
        while(org!=0){
            long temp = org%10;
              long mul =1;
            for(long i=1; i<=count;i++){
                mul = mul*temp;
            }
            sum = sum + mul;
            org= org/10;
        }
    
        if(sum ==last){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
    }
}
