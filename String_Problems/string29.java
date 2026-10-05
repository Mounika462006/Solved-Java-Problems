import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == ' '){
                continue;
            }
            boolean check = true;
            for(int j=0; j<s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.print(s1.charAt(i));
            }
        }

    }
}
