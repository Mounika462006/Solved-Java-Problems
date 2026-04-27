import java.util.Scanner;

public class nested3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String type = sc.nextLine();

        for(int i =1;i<=num ;i++){
            for(int j =1;j<=i;j++){
                if(type.equalsIgnoreCase("Star")){
                    System.out.print("*");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

