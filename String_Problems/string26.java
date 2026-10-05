import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) ==' '){
                continue;
            }
            boolean check = false;
            for(int k =0; k<i; k++){
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(k))){
                    check = true;
                    break;
                }
            }
            if(check){
                continue;
            }


            for(int j =i+1; j<s.length(); j++){
                    if(Character.isLetter(s.charAt(j)) && Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
                        System.out.print(Character.toLowerCase(s.charAt(i)) +" ");
                        break;
                    }
            }
        }
    }
}
