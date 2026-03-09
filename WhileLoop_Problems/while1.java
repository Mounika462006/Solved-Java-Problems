import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String corPass = sc.nextLine();
        int n =3;
        int i=1;
        while (i<=n) {
            System.out.println("Enter the Password: ");
            String pass = sc.next();
            if(corPass.equalsIgnoreCase(pass)){
                System.out.println("Acess Granted");
            }
            else{
                int  a = n-i;
                if(a == 0){
                    System.out.println("Account locked!");
                }
                else{
                    System.out.println("Incorrect! Attempts remaining: "+a );

                }
            }

            i++;
        }
       

    }
}
