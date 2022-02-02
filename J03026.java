import java.util.*;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(solve(s1, s2));
        }
        sc.close();
    }

    static int solve(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        if (len1 != len2)
            return len1 > len2 ? len1 : len2;
        if (a.equals(b) == false)
            return len1;
        else 
            return -1;
    }

}
