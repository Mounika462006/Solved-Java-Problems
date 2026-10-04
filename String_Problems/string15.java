import java.util.*;
public class Main{
    public static void stringCompare(String a, String b){
        if(a.equals(b)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        stringCompare(s1, s2);
    }
}
