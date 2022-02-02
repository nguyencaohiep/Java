
import java.util.Scanner;

public class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        this.tuSo = sc.nextLong();
        this.mauSo = sc.nextLong();
        sc.close();
    }

    public long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public void rutGon() {
        long gcd = gcd(tuSo, mauSo);
        tuSo = tuSo / gcd;
        mauSo = mauSo / gcd;
    }

    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
