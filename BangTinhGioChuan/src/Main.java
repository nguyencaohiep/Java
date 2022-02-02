import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> arrMon = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("\\s+");
            arrMon.add(new MonHoc(line[0], line[1]));
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> arrGV = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("\\s+");
            String ten = "";
            for(int j = 1; j < line.length; j++){
                ten += line[j] + " ";
            }
            arrGV.add(new GiangVien(line[0], ten));
        }
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("\\s+");
            GiangVien gV = arrGV.stream().filter(gv -> gv.getId().equals(line[0])).findFirst().get();
            gV.tinhSoGio(Double.parseDouble(line[2]));
        }
        for(GiangVien gv : arrGV){
            System.out.println(gv);
        }
        sc.close();
    }
}
/*
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
3
GV01 INT1155 113.2
GV02 INT1306 126.72
GV01 INT1155 56.71
 */