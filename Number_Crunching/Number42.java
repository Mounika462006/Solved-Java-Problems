import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long n1 = n;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        int start =1;
        for(int i=1; i<count; i++){
            start = start*10;
        }

        boolean check = true;
        for(int i =0; i<count;i++){
           int add =0;
           for(int k=1; k<=n1;k++){
            if(n1 % k==0){
                add++;
            }
           }
           if(add !=2){
                check = false;
                break;
           }
           long rem = n1 %10;
           long quo = n1 /10;
           long rev = (rem * start) + quo;
           n1 = rev;

        }
        if(check){
            System.out.print("CIRCULAR PRIME");
        }
        else{
            System.out.print("NOT CIRCULAR PRIME");
        }
    }
}
