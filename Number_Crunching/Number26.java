import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean value = true;
        // for(int i=2; i<n; i++){
        //     if(n%i==0){
        //         int count=0;
        //         for(int j=1; j<=i;j++){
        //             if(i%j==0){
        //                 count++;
        //             }
        //         }
        //         if((count==2) &&(i==2 || i==3 || i==5)){
        //             value=true;
        //         }
        //         else{
        //             value = false;
        //         }
        //     }
        // }
        // if(value){
        //     System.out.print("Yes");
        // }
        // else{
        //     System.out.print("No");
        // }

        while(n%2==0){
            n= n/2;
        }
        while(n % 3==0){
            n= n/3;
        }
        while(n % 5==0){
            n=  n/5;
        }
        if(n==1){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
