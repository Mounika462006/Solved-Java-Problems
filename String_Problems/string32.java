import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++){
            boolean check = false;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.print(s.charAt(i));
                break;
            }
        }
    }
}
