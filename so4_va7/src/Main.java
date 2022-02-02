import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            if (check1(str) && check2(str))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }

    public static boolean check1(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            int n1 = Integer.parseInt(str.charAt(i) + "");
            int n2 = Integer.parseInt(str.charAt(i + 1) + "");
            if (Math.abs(n1 - n2) != 2)
                return false;
        }
        return true;
    }

    public static boolean check2(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.charAt(i) + "");
        }
        return sum % 10 == 0;
    }
}
/*
3
1353
246864
123435
 */