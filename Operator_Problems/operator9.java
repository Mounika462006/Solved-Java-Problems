import java.util.Scanner;

public class operator9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int username = sc.nextInt();
        int passwrd = sc.nextInt();
        int accLock = sc.nextInt();
        if(username ==1 && passwrd ==1 && accLock ==0){
            System.out.println("Login Success");
        }else{
            System.out.println("Login Failed");
        }

    }
}
