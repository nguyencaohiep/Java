import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        HashMap<String, Pupil> hmP = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            Pupil pupil = new Pupil(id,sc.nextLine(),sc.nextLine(),sc.nextLine());
            hmP.put(id, pupil);
        }
        sc = new Scanner(new File("MONHOC.in"));
        int m = Integer.parseInt(sc.nextLine());
        HashMap<String, Subject> hmS = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String id = sc.nextLine();
            Subject sub = new Subject(id,sc.nextLine(),Integer.parseInt(sc.nextLine()));
            hmS.put(id,sub);
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        int z = Integer.parseInt(sc.nextLine());
        ArrayList<Points> arrP = new ArrayList<>();
        for (int i = 0; i < z; i++) {
            String[] line = sc.nextLine().trim().split("\\s+");
            Pupil pupil = hmP.get(line[0]);
            Subject sub = hmS.get(line[1]);
            Points points = new Points(pupil,sub,line[2]);
            arrP.add(points);
        }
        arrP.sort((o1,o2) -> {
            if(o1.getPoint().equals(o2.getPoint())) {
                return o1.getIdSub().compareTo(o2.getIdSub());
            }
            else{
                return -1*o1.getPoint().compareTo(o2.getPoint());
            }
        });
        int k = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < k; i++) {
            String id = sc.nextLine();
            Subject sub = hmS.get(id);
            System.out.println("BANG DIEM MON " + sub.getName() + ":");
            for(Points points : arrP){
                if(id.equals(points.getIdSub())){
                    System.out.println(points);
                }
            }
        }
        sc.close();

    }
}
