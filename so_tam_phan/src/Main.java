import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            if (check(str))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }

    public static boolean check(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            int n1 = Integer.parseInt(str.charAt(i) + "");
            int n2 = Integer.parseInt(str.charAt(i + 1) + "");
            if (Math.abs(n1 - n2) != 1)
                return false;
        }
        return true;
    }
}
/*
3
123212
5654345676
10233211123
 */
