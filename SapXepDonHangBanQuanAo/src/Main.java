import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> arrS = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrS.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> arrH = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split("\\s+");
            String ma = String.format("-%03d", i + 1);
            SanPham sp = arrS.stream().filter(s -> s.getMa().equals(data[0].substring(0,2))).findFirst().get();
            arrH.add(new HoaDon(data[0]+ma, Long.parseLong(data[1]), sp));
        }
        Collections.sort(arrH);
        for(HoaDon hd : arrH){
            System.out.println(hd);
        }
        sc.close();
    }
}
/*
2
AT
Ao tun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105
 */
