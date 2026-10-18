import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n!=1 && n!=4){
            int sum =0;
            while(n>0){
                int temp  = n%10;
                int sq = temp * temp;
                sum= sum+sq;
                n=n/10;
            }
            n= sum;
        } 
          

            if(n==1){
                System.out.print("Yes");
            }
            else{
                System.out.print("No");
            }
        
        
            
        
        
    }
}
