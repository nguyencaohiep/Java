import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, MonHoc> hsM = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            hsM.put(id, new MonHoc(id, sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        sc = new Scanner(new File("LICHGD.in"));
        n = Integer.parseInt(sc.nextLine());
        ArrayList<LopHoc> arrL = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = String.format("HP%03d", i + 1);
            String idMon = sc.nextLine();
            MonHoc mh = hsM.get(idMon);
            String tenMon = mh.getTen();
            LopHoc lh = new LopHoc(id, idMon, tenMon, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arrL.add(lh);
        }
        String[] ten = sc.nextLine().split(" ");
        ArrayList<LopHoc> arrLH = new ArrayList<>();
        for(String t : ten){
            for (LopHoc lh : arrL){
                if(lh.getTenGV().equals(t)){
                    arrLH.add(lh);
                }
            }
        }
        Collections.sort(arrLH);
        ArrayList<String> tenGV = new ArrayList<>();
        for (LopHoc lh : arrLH){
            String t = lh.getTenGV();
            if(!tenGV.contains(t)){
                tenGV.add(t);
            }
        }
        for(String t : tenGV){
            System.out.println("LICH GIANG DAY GIANG VIEN " + t);
            for (LopHoc lh : arrLH){
                if(lh.getTenGV().equals(t)){
                    System.out.println(lh);
                }
            }
        }
        sc.close();
    }
}
