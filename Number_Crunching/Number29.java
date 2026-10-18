import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long max_ite = sc.nextLong();
        long count=0;

        while(max_ite!=count){
            long num_dup = num; 
            long org_rev = 0;
            while(num_dup>0){
                long temp = num_dup%10;
                org_rev = org_rev*10 + temp;
                num_dup/=10;
            }
            long add = num + org_rev;

            long add_dup = add;
            long pali= 0;

            while(add_dup>0){
                long tem = add_dup %10;
                pali = pali*10 + tem;
                add_dup/=10;
            }
            if(add==pali){
                System.out.print("No");
                break;
            }
                num = add;
                count++;
        }
        if(max_ite==count){
            System.out.print("Yes");
        }
    }
}
