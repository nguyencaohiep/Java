package J04003;
import java.util.*;

public class Phanso {
    private long numerator;
    private long denominator;

    public Phanso (long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        this.numerator = sc.nextLong();
        this.denominator = sc.nextLong();
        sc.close();
    }

    public void rutGon() {
        long a = this.numerator;
        long b = this.denominator;
        while ((a != 0) && (b != 0)) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        this.numerator /= (a + b);
        this.denominator /= (a + b);
    }

    public String toString() {
       return this.numerator + "/" + this.denominator;
    }

}


