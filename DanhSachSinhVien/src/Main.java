import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Pupil> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Pupil pupil = new Pupil(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            arr.add(pupil);
        }
        arr.sort((o1,o2) -> {
            return o1.getId().compareTo(o2.getId());
        });
        for(Pupil tmp : arr){
            System.out.println(tmp);
        }
        sc.close();
    }
}
