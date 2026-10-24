import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cat =1;
        for(int i=1;i<n;i++){
            
            cat = cat * ( 2 *((2*i)+1)) / (i + 2);
        }
        System.out.print(cat +" ");
    }
}
