import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] arr = s.split(" ");
        boolean find = false;

        for(char ch ='a'; ch<='z'; ch++){
            boolean check = true;
            for(int i=0; i<arr.length; i++){

                if(!arr[i].contains(String.valueOf(ch))){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.print(ch +" ");
                find = true;
            }
        }
        if(!find){
            System.out.print("-1");
        }
    }
}
