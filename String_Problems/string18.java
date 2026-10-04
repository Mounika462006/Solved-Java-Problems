import java.util.*;
public class Main{

    public static void countWords(String a){
       String[] arr = a.split(" ");
        System.out.print(arr.length);
    }

    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        String s = sc.nextLine();
         countWords(s);
    }
}
