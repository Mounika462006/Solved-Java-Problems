import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        String occured="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isLetter(ch)|| occured.indexOf(ch)!=-1){
                continue;
            }
            int count=0;
            for(int j=0;j<str.length();j++){
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            System.out.println(ch+":"+count);
            occured=occured+ch;
        }
        sc.close();
    }
}
