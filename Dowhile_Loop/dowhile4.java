import java.util.Scanner;

public class dowhile4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long phone = sc.nextLong();
        int count =0;
        long rev = phone;
        do{
            rev = rev / 10;
            count++;
        }while(rev>0);
        if(count==10){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
