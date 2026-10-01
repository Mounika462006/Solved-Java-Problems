import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long smallest = Long.MAX_VALUE;
        long secondSmallest = Long.MAX_VALUE;

        for (long num : arr) {

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println(secondSmallest);
    }
}
