import java.util.*;
public class Main{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%10==0){
            System.out.println("No");
            return;
        }
        
        long org_sq = n*n; //144
        
        long rev = 0; //21
        while(n!=0){
            long temp = n%10;
            rev = rev*10+temp;
            n/=10;
        }
        long rev_sqr = rev *rev;// 21 21 = 441
        
        long oppo = 0;//441
        while(org_sq!=0){
            long temp = org_sq%10;
            oppo = oppo*10+temp;
            org_sq/=10;
        }
        
        if(oppo == rev_sqr){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
        
    }
}
