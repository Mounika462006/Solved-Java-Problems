import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxcount = 0;
        char maxval = s.charAt(0);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) ==' '){
                continue;
            }

            int count=0;
            for(int j=0; j<s.length(); j++){
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount = count;
                maxval = Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.print(maxval+":"+maxcount);

       
    }
}
