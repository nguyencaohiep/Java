import java.util.*;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Set<Integer> s = new HashSet<Integer>();
            for (int i = 1; i <= n; i++) {
                int tmp = sc.nextInt();
                if (tmp > 2)
                    s.add(tmp);
            }
            List<Integer> arr = new ArrayList<Integer>(s);
            // Arrays.sort(arr);
            // int tmp[] = { 0, 1, 2, 3 };
            // boolean check = false;
            // while (!check) {
            //     if (solve(arr[tmp[1]], arr[tmp[2]], arr[tmp[3]]) == true) {
            //         System.out.println("YES");
            //         check = true;
            //     } else {
            //         int i = 3;
            //         while (i > 0 && tmp[i] == n - 3 + i)
            //             i--;
            //         if (i == 0) {
            //             check = true;
            //             System.out.println("NO");
            //         } else {
            //             tmp[i]++;
            //             for (int j = i + 1; j <= 3; j++)
            //                 tmp[j] = tmp[i] + j - i;
            //         }
            //     }
            // }
        }
        sc.close();
    }

    static boolean solve(int a, int b, int c) {
        long tmp1 = (long) Math.pow(a, 2);
        long tmp2 = (long) Math.pow(b, 2);
        long tmp3 = (long) Math.pow(c, 2);
        if (tmp1 + tmp2 == tmp3)
            return true;
        return false;
    }
}
