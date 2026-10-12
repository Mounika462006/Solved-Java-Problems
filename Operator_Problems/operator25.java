import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        int cal = age * 7;
        System.out.printf("%d years old in dog years.", cal);
        
    }
}
