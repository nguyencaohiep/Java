import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> arrM = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            MonHoc mh = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            String htth = mh.getHinhThucTH();
            String tmp ="";
            int t = 0;
            for (int j = 0 ; j < htth.length();j++){
                if(htth.charAt(j) == '.'){
                    t = j;
                    break;
                }
            }
            tmp = htth.substring(t + 1);
            if(htth.equals("Truc tuyen") || tmp.equals("ptit.edu.vn")){
                arrM.add(mh);
            }
        }
        Collections.sort(arrM);
        for (MonHoc mh : arrM){
            System.out.println(mh);
        }
        sc.close();
    }
}
