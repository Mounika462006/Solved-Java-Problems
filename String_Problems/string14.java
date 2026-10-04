import java.util.*;
public class Main{
    public static void stringConcatenate(String a, String b){
        String concate = a+b;
        System.out.print(concate);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        stringConcatenate(s1, s2);
    }
}
