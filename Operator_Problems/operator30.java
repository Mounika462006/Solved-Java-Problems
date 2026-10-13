import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        int last = n /10;
        int sec_last = last % 10;
        
        int temp =n;
        while(temp>=10){
            temp/=10;
            
        }
        
        int sum = temp + sec_last;
        System.out.println(sum);
        
    }
}
