import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();
        long digit = sc.nextLong();
    
        for(long i = start; i<=end;i++){

            long dup =i;
            long dig_no = i;
            boolean check = true;

            while(dig_no >0){
                    long temp = dig_no % 10;
                    if(temp == digit){
                        check = false;
                        break;
                        
                    }
                    dig_no/=10;
            }

            long last = dup % 10;
            long bal = dup / 10;
            long sum =last;

            while(bal>0){
                long temp = bal % 10;
                if(temp > sum){
                    sum = sum+ temp;
                }
                else{
                    check = false;
                    break;
                }
                bal = bal/10;
            }

            if(check){
                System.out.print(i +" ");
            }
        }

    }
}
