import java.util.*;
import java.lang.Math;

public class J01021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            } else {
                System.out.println(solve(a, b));
            }
        }
        sc.close();
    }

    static long solve(long a, long b) {
        long e = (long) (Math.pow(10, 9) + 7);
        if (b == 0)
            return 1;
        if (b == 1)
            return a;
        long tmp = solve(a, b / 2);
        tmp = (tmp * tmp) % e;
        if (b % 2 == 1)
            tmp = (tmp * a) % e;
        return tmp;
    }
}
