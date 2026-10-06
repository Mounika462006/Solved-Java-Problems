import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        for(int i=0; i<arr.length; i++){
            String rev ="";
            if(arr[i].length() % 2 ==1){
                for(int j=arr[i].length()-1; j>=0; j--){
                    rev = rev + arr[i].charAt(j);
                }
            }
            else{
                rev = arr[i];
            }
            System.out.print(rev +" ");
        }
    }
}
