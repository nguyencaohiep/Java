import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long sum = 0;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                sum -= 2 * arr[i];
                k--;
                if (k == 0) {
                    System.out.println(sum);
                    return;
                }
            } else {
                long min;
                if (i == 0)
                    min = arr[0];
                else
                    min = -arr[i - 1];
                min = Math.min(min, arr[i]);
                if (k % 2 != 0)
                    sum -= 2 * min;
                System.out.println(sum);
                return;
            }
        }
        sc.close();
    }
}
/*
6 3
4 -2 1 3 5 -5
-5 -2 1 3 4 5
 */
