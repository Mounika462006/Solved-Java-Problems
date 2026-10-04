import java.util.*;
public class Main{
    public static int countVowel(String a){
        int count =0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) =='a' || a.charAt(i) =='e' || a.charAt(i) =='i' || a.charAt(i) =='o' || a.charAt(i) =='u' ||
            a.charAt(i) =='A' || a.charAt(i) =='E' || a.charAt(i) =='I' || a.charAt(i) =='O' || a.charAt(i) =='U'){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int value = countVowel(s);
        System.out.print(value);
    }
}
