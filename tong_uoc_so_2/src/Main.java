import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] uoc = new int[b + 1];
        for (int i = 2; i <= b; i++) {
            for (int j = i * 2; j <= b; j += i) {
                uoc[j] += i;
            }
        }
        int cou = 0;
        for (int i = a; i <= b; i++) {
            if (uoc[i] + 1 > i)
                cou++;
        }
        System.out.println(cou);
        sc.close();
    }
}
