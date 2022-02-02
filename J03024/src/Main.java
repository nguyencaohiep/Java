import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String string = sc.nextLine();
            int res = check(string);
            if(res == 0)
                System.out.println("INVALID");
            else if(res == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }

    static int check(String str) {
        int even = 0, odd = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                return 0;
            else {
                int n = Integer.parseInt(str.charAt(i) + "");
                if (i == 0 && n == 0)
                    return 0;
                if (n % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }
        if (even > odd && str.length() % 2 == 0)
            return 1;
        else if (odd > even && str.length() % 2 != 0)
            return 1;
        return -1;
    }
}
/*
3
01234aa32432432432534545b987978
1234567890123456789000
999999999999999999999999999999
 */