import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VanDongVien> arrV = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrV.add(new VanDongVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arrV);
        for(VanDongVien v : arrV){
            System.out.println(v);
        }
        sc.close();
    }
}
/*
3
Tran Vu Minh
Ha Noi
8:30
Vu Ngoc Hoang
Hoa Binh
8:20
Pham Dinh Tan
An Giang
8:45
 */