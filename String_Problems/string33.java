import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int count =1;

            while(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            System.out.print(ch+""+count);
        }
    }
}
