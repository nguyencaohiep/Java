import java.util.List;

public class DaThuc {
    private String sumMonomial;

    public DaThuc(String input) {
        this.sumMonomial = input;
    }

    public DaThuc cong(DaThuc b) {
        String sumB = b.sumMonomial;
        String[] s1 = this.sumMonomial.split(" [+] ");
        int len1 = s1.length;
        String[] s2 = sumB.split(" [+] ");
        int len2 = s2.length;
        String res = "";
        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            String m1 = s1[i];
            String m2 = s2[j];
            int sm1 = Integer.parseInt(m1.substring(m1.indexOf("^") + 1));
            int sm2 = Integer.parseInt(m2.substring(m2.indexOf("^") + 1));
            if (sm1 == sm2) {
                int h1 = Integer.parseInt(m1.substring(0, m1.indexOf("*")));
                int h2 = Integer.parseInt(m2.substring(0, m2.indexOf("*")));
                res += (h1 + h2) + m1.substring(m1.indexOf("*"), m1.indexOf("^") + 1) + sm1 + " + ";
                i++;
                j++;
            } else if (sm1 > sm2) {
                res += m1 + " + ";
                i++;
            } else {
                res += m2 + " + ";
                j++;
            }
        }
        if (i < len1) {
            for (int k = i; k < len1 - 1; k++) {
                res += s1[k] + " + ";
            }
            res += s1[len1 - 1];
        }
        if (j < len2) {
            for (int k = j; k < len2 - 1; k++) {
                res += s2[k] + " + ";
            }
            res += s2[len2 - 1];
        }
        if (res.charAt(res.length() - 2) == '+')
            res = res.substring(0, res.length() - 3);
        return new DaThuc(res);
    }

    public String toString() {
        return this.sumMonomial;
    }
}
