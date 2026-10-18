import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dup =n;
        int sq = n * n;
        int count=0;
        while(n>0){
            int temp = n%10;
            count++;
            n=n/10;
        }
        int start =1;
        for(int i=1; i<=count;i++){
            start = start*10;
        }
        int split = sq % start;
        int bal = sq / start;
        int sum = split+ bal; 
        if(sum==dup){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }

    }
}
