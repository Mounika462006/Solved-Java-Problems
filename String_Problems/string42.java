import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[i].length(); j++){

                if( j!=0 && j!=arr[i].length()-1){
                    System.out.print(arr[i].charAt(j));
                }
            }
            System.out.print(" ");
            
        }
    }
}
