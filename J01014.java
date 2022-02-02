import java.util.*;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(result(n));
        }
        sc.close();
    }

    static long result(long n) {
        long sq = (long) (Math.sqrt(n));
        long res = 0;
        for (long i = 1; i <= sq; i++) {
            if (n % i == 0) {
                if (prime(n / i)) {
                    return n / i;
                }
                else if(prime(i)){
                    res = i;
                }
            }
        }
        return res;
    }

    static boolean prime(long n) {
        if (n < 2) {
            return false;
        } else if (n > 3) {
            for (long i = 2; i < Math.sqrt(n) + 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
