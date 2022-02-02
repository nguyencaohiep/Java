import java.util.Arrays;
import java.util.Scanner;

public class KhoangCachNhoHonK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a,0,n);
            long cnt = 0;

            for (int i = 0; i < n - 1; i++) {
                int tmp = a[i] + k;
                int loc = lower_bound(a, i, n, tmp);

                cnt += loc - i - 1;
            }

            System.out.println(cnt);
        }
        scanner.close();
    }

    public static int lower_bound(int a[], int l, int r, int x) {
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (a[m] >= x)
                r = m;
            else
                l = m;
        }
        return r;
    }
}