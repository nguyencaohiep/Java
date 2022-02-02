import java.util.*;
/* ta nhận thấy 1 mod 5 luôn là 1, 2^n mod 5 = {1, 2, 4, 3} lần lượt tương ứng với n mod 4 dư {0, 1, 2, 3}
tương tự 3^n mod 5 = {1, 3, 4, 2} và 4^n mod 5 = {4, 1} lần lượt n chẵn hay lẻ 
ta tìm số dư đối với mỗi cơ số rồi cộng lại và lấy chia dư
*/
public class J03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int base_2[] = { 1, 2, 4, 3 };
        int base_3[] = { 1, 3, 4, 2 };
        while (t-- > 0) {
            String str = sc.next();
            String tmp;
            if (str.length() > 1)
                tmp = str.substring(str.length() - 2);
            else
                tmp = str;
            int n = Integer.parseInt(tmp);
            n = n % 4;
            int res = 1;
            res += base_3[n] + base_2[n];
            if (n % 2 == 0) {
                res += 1;
            } else {
                res += 4;
            }
            System.out.println(res % 5);
        }
        sc.close();
    }
}
