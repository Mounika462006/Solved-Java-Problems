import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int length = num.length();
        for(int i=0;i<length;i++){
            if(i==0 && num.charAt(i) =='0'){
                continue;
            }
            else if(num.charAt(i)=='1'){
                System.out.print("one " );
            }
            else if(num.charAt(i)=='2'){
                System.out.print("two ");
            }
            else if(num.charAt(i)=='3'){
                System.out.print("three ");
            }
            else if(num.charAt(i)=='4'){
                System.out.print("four ");
            }
            else if(num.charAt(i)=='5'){
                System.out.print("five ");
            }
            else if(num.charAt(i)=='6'){
                System.out.print("six ");
            }
            else if(num.charAt(i)=='7'){
                System.out.print("seven ");
            }
            else if(num.charAt(i)=='8'){
                System.out.print("eight ");
            }
            else if(num.charAt(i)=='9'){
                System.out.print("nine ");
            }
            else{
                System.out.print("zero ");
            }
        }
    }
}
