package J04004;

class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public void rutGon() {
        long gcd = gcd(tuSo, mauSo);
        tuSo = tuSo / gcd;
        mauSo = mauSo / gcd;
    }

    public PhanSo add(PhanSo p) {
        this.tuSo = (this.tuSo * p.mauSo) + ( this.mauSo * p.tuSo) ;
        this.mauSo *= p.mauSo; 
        return this;
    }

    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
