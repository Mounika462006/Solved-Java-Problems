import java.util.Scanner;

public class while30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i=0;
        int count  =0;

        while(i<str.length()){
            count++;
            i++;
        }
        System.out.println("Length: "+ count);
    }
}
