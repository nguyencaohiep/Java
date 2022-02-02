import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        long res = 1;
        for (int i = 2; i <= n; i++)
            res += giaithua(i);
        System.out.println(res);
        sc.close();

    }

    public static long giaithua(int n) {
        long res = 1;
        for (long i = 2; i <= n; i++)
            res *= i;
        return res;
    }
}
