import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            long tmp = 0;
            long[] arr = new long[m];
            for (int j = 0; j < m; j++) {
                tmp = sc.nextLong();
                arr[j] = tmp * tmp;
            }
            Arrays.sort(arr);
            if (check(arr, m))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }

    public static boolean check(long[] a, int m) {
        for (int i = 2; i < m; i++) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (a[l] + a[r] == a[i])
                    return true;
                else if (a[l] + a[r] < a[i])
                    l++;
                else
                    r--;
            }
        }
        return false;
    }
}
/*
2
5
3 1 4 6 5
3
1 1 1
 */