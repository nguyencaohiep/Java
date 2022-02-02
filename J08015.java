import java.util.*;

public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            int cou = 0;
            int left = 0;
            int right = n - 1;
            while (left < right) {
                long sum = arr[left] + arr[right];
                if (sum > k) {
                    right -= 1;
                } else if (sum < k) {
                    left += 1;
                } else {
                    cou++;
                    left += 1;
                    right -= 1;
                }
            }
            System.out.println(cou);
        }
        sc.close();
    }
}
