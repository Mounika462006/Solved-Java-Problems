import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int k = sc.nextInt();

        for (int i = 0; i + k <= s.length(); i += k) {

            for (int j = i + k - 1; j >= i; j--) {
                System.out.print(s.charAt(j));
            }
        }

        int rem = s.length() % k;
        if (rem != 0) {
            int start = s.length() - rem;

            for (int j = start; j < s.length(); j++) {
                System.out.print(s.charAt(j));
            }
        }
    }
}
