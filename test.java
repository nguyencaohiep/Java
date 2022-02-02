import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            khaibao2 a = new khaibao2();
            sc.nextLine();
            a.nhap(sc);
            a.xuly();
            System.out.print("B20DCCN");
            System.out.printf("%03d ", i);
            a.xuat();
        }
    }
}

class khaibao2 {
    public khaibao2() {
    }

    private String name = "", lop = "", date = "", ans1 = "", ans2 = "";
    private float gpa = 0;

    public void nhap(Scanner sc) {
        do {
            this.name = sc.nextLine();
        } while (name == "");
        lop = sc.next();
        date = sc.next();
        gpa = sc.nextFloat();
    }

    public void xuly() {
        name = name.trim();
        name = name.toLowerCase();
        name = name.replaceAll("\\s+", " ");
        String tmp1[] = name.split(" ");
        for (String tmp2 : tmp1) {
            ans1 += String.valueOf(tmp2.charAt(0)).toUpperCase() + tmp2.substring(1, tmp2.length()) + " ";
        }
        String tmp = "";
        int dem = 0;
        for (int i = 0; i < date.length(); i++) {
            if (date.charAt(i) >= '0' && date.charAt(i) <= '9') {
                tmp += date.charAt(i);
            } else {
                dem++;
                if (dem <= 2 && tmp.length() < 2)
                    tmp = "0" + tmp;
                if (dem <= 2)
                    ans2 += tmp + "/";
                tmp = "";
            }
        }
        ans2 += tmp;
    }

    public void xuat() {
        System.out.print(ans1 + " " + lop + " " + ans2 + " ");
        System.out.printf("%.2f", gpa);
        System.out.println("");
    }
}