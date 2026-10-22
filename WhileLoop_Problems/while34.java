  import java.util.*;
  public class Main{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          long n = sc.nextLong();
          long pos = sc.nextLong();
          int index=0;                     
        
          long[] arr = new long[(int)n];
          for(long i =1;i<=n;i++){
              if(n%i==0){
                  arr[index] =i;
                  index++;
              }
          }
          long len = index - pos;
          System.out.print(arr[(int)len]);
        
      }
  }
