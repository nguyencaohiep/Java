import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if ((n * 9 < m) || (n > 0 && m == 0)) {
            System.out.println("-1 -1");
            return;
        }
        StringBuilder max = new StringBuilder();
        for (int i = 0; i < m / 9; i++) {
            max.append("9");
        }
        max.append(m % 9);
        while (max.length() < n)
            max.append("0");
        String tmp = "";
        for (int i = max.length() - 1; i >= 0; i--) {
            tmp += max.charAt(i) + "";
        }
        System.out.println(findMin(n,m) + " " + max);
        sc.close();
    }

    static String findMin(int d, int s) {
        int num[] = new int[d];
        String res = "";
        s -= 1;
        for (int i = d - 1; i > 0; i--) {
            if (s > 9) {
                num[i] = 9;
                s -= 9;
            } else {
                num[i] = s;
                s = 0;
            }
        }
        num[0] = s + 1;
        for (int i = 0; i < d; i++)
            res += Integer.toString(num[i]);
        return res;
    }
}
