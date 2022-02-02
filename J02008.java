import java.util.*;

public class J02008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long result = 1;
            for (long i = 2; i <= n; i++) {
                result = (result / (gcd(result, i))) * i;
            }
            System.out.println(result);
        }
        sc.close();
    }

    static long gcd(long a, long b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }
}
