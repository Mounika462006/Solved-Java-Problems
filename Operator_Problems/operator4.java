import java.util.Scanner;

public class operator4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limit = sc.nextInt();
        int purchase = sc.nextInt();
        int cardBlock = sc.nextInt();
        if(purchase<=limit && cardBlock == 0){
            System.out.println("Approved");
        }else{
            System.out.println("Declined");
        }
    }
}
