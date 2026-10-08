import java.util.*;

public class Main{

    public static int stringLength(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            count++;
        }
        return count;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = stringLength(s);
        System.out.print(length);
    }
}
