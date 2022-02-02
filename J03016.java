import java.util.*;
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String m = sc.next();
            int s = 0;
            for (int i = 0; i < m.length(); i++) {
                if (i % 2 == 0) {
                    s += m.charAt(i) - '0';
                } else {
                    s -= m.charAt(i) - '0';
                }
            }
            if (s % 11 == 0)
                System.out.println(1);
            else
                System.out.println(0);
        }
        sc.close();
    } 
}
// cách 2 dùng bigInteger