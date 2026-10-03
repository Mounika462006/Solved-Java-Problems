import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        Arrays.sort(arr);

        int max = arr[n - 1];
        int count = 0;

        for (int num = arr[0] + 1; num < max; num++) {
            boolean find = false;

            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    find = true;
                    break;
                }
            }

            if (!find) {
                count++;

                if (count == k) {
                    System.out.println(num);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
