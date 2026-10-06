import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i+=2){
            char ch = s.charAt(i);
            int count = s.charAt(i+1) - '0';

            for(int j=1; j<=count; j++){
                System.out.print(s.charAt(i));
            }
        }
    }
}
