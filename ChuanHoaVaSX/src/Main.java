import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<HoVaTen> arr = new ArrayList<>();
        while (sc.hasNextLine()){
            String tmp = sc.nextLine();
            if(tmp.equals("")){
                break;
            }
             String[] line = tmp.toLowerCase().split("\\s+");
             String t = "";
             for(int i = 0; i < line.length; i++){
                 t += (line[i].charAt(0)+"").toUpperCase() + line[i].substring(1) + " ";
             }
             HoVaTen hvt = new HoVaTen(tmp.trim());
             arr.add(hvt);
        }
        Collections.sort(arr);
        for(HoVaTen h : arr){
            System.out.println(h);
        }
        sc.close();
    }


}
