import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<SanPham> arrS = new ArrayList<>();
        arrS.add(new SanPham("X", "Xang", 128000, 3/100.0));
        arrS.add(new SanPham("D", "Dau", 11200, 3.5/100.0));
        arrS.add(new SanPham("N", "Nhot", 9700, 2/100.0));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> arrD = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split("\\s+");
            SanPham sp = arrS.stream().filter(s -> s.getMa().equals(data[0].charAt(0)+"")).findFirst().get();
            DonHang dh = new DonHang(data[0], Long.parseLong(data[1]), sp);
            arrD.add(dh);
        }
        Collections.sort(arrD);
        for(DonHang dh : arrD){
            System.out.println(dh);
        }

    }
}

/*
3
N89BP 4500
D00TN 3500
X92SH 2600
 */
