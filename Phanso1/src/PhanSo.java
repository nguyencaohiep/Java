public class PhanSo {
    private long tu;
    private long mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public void rutGon() {
        long gcd = gcd(tu, mau);
        this.tu = this.tu / gcd;
        this.mau = this.mau / gcd;
    }

    public PhanSo cong(PhanSo b) {
        PhanSo tmp = new PhanSo(this.tu * b.mau + this.mau * b.tu, this.mau * b.mau);
        return tmp;
    }

    public PhanSo nhan(PhanSo b) {
        PhanSo tmp = new PhanSo(this.tu * b.tu, this.mau * b.mau);
        return tmp;
    }

    public String toString() {
        return this.tu + "/" + this.mau;
    }
}
