import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2= sc.nextLine();

        String temp = s1 ;
        s1= s2;
        s2 = temp;
        System.out.println(s1);
        System.out.println(s2);
    }
}
