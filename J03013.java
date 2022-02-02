import java.math.BigInteger;
import java.util.*;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String tmp1 = sc.next();
            int len_a = tmp1.length();
            BigInteger a = new BigInteger(tmp1);
            String tmp2 = sc.next();
            int len_b = tmp2.length();
            BigInteger b = new BigInteger(tmp2);
            BigInteger result = a.subtract(b).abs();
            String tmp = result.toString();
            int len_res = tmp.length();
            int len = len_a > len_b ? len_a : len_b;
            for (int i = 0; i < len - len_res; i++) {
                tmp = "0" + tmp;
            }
            System.out.println(tmp);
        }
        sc.close();
    }

}
