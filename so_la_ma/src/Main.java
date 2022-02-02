import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String in = sc.nextLine();
            System.out.println(solve(in));
        }
        sc.close();
    }

    static int solve(String in) {
        int res = 0;
        for (int i = 0; i < in.length(); i++) {
            int c1 = value(in.charAt(i));
            if (i + 1 < in.length()) {
                int c2 = value(in.charAt(i + 1));
                if (c1 >= c2)
                    res += c1;
                else {
                    res += c2 - c1;
                    ++i;
                }
            } else
                res += c1;
        }
        return res;
    }

    static int value(char c) {
        if (c == 'I')
            return 1;
        else if (c == 'V')
            return 5;
        else if (c == 'X')
            return 10;
        else if (c == 'L')
            return 50;
        else if (c == 'C')
            return 100;
        else if (c == 'D')
            return 500;
        else if (c == 'M')
            return 1000;
        return 0;
    }
}
/*
3
XIX
DC
CD
 */