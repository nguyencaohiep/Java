import java.util.*;

public class J01013 {
    static final int maxLength = 2000001;
    static int[] isPrime = new int[maxLength];// mảng isPrime, với index là i sẽ lưu giá trị ước nguyên tố nhỏ nhất của i

    static void sieve() {
        for (int i = 1; i < maxLength; i++) {
            isPrime[i] = i;
        }

        for (int i = 4; i < maxLength; i += 2) {
            isPrime[i] = 2;
        }
        // trừ 2 ra thì tất cả các số chẵn đều k phải số nguyên tố

        for (int i = 3; i * i < maxLength; i += 2) {
            for (int j = i * i; j < maxLength; j += i) {
                if (isPrime[j] == j) {
                    isPrime[j] = i;
                }
            }
        }
    }

    static long calc(int n) {
        long sum = 0;
        while (n != 1) {
            sum += isPrime[n];
            n /= isPrime[n];
        }
        return sum;

    }

    public static void main(String[] args) {
        sieve();
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum += calc(sc.nextInt());
        }
        System.out.println(sum);
        sc.close();

    }
}