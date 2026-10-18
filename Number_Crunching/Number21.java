import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
       long sum=0;
       while(n>0){
           long temp = n%10;
           sum= sum+temp;
           n=n/10;
       }
       
       long add=0;
       while(sum>0){
           long val =sum % 10;
           add = add+val;
           sum= sum/10;
       }
       System.out.print(add);
    }
}
