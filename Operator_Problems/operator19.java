import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int amunt = sc.nextInt();
        
         int hun_div = amunt/ 100;
         System.out.printf("%d Note(s) of 100.00\n", hun_div);
         
         int hun_rem = amunt % 100;   
         int fif_div = hun_rem / 50; 
         System.out.printf("%d Note(s) of 50.00\n", fif_div);
         
         int fif_rem = hun_rem % 50; 
         int twe_div = fif_rem / 20; 
         System.out.printf("%d Note(s) of 20.00\n", twe_div);
         
         int twe_rem = fif_rem % 20;   
         int ten_div = twe_rem /10;  
         System.out.printf("%d Note(s) of 10.00\n",ten_div);
         
         int ten_rem = twe_rem % 10;
         int five_div = ten_rem /5;
         System.out.printf("%d Note(s) of 5.00\n", five_div);
         
         int five_rem = ten_rem % 5;
         int two_div = five_rem / 2;
         System.out.printf("%d Note(s) of 2.00\n", two_div);
         
         int two_rem = five_rem % 2;
         int one_div = two_rem /1;
         System.out.printf("%d Note(s) of 1.00\n", one_div);
    }
}
