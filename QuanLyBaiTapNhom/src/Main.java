import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc3 = new Scanner (new File("NHOM.in"));
        HashMap<String, String> hm = new HashMap<String, String>();

        while(sc3.hasNextLine()){
            String[] line = sc3.nextLine().split("\\s+");
            hm.put(line[0],line[1]);
        }
        sc3.close();
        Scanner sc2 = new Scanner (new File("BAITAP.in"));
        int m = Integer.parseInt(sc2.nextLine());
        String[] exercise = new String[m];
        for (int i = 0; i < m; i++) {
            String tmp = sc2.nextLine();
            exercise[i] = tmp;
        }
        sc2.close();
        Scanner sc1 = new Scanner (new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<Pupil> arrP = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc1.nextLine();
            String name = sc1.nextLine();
            String phoneNumber = sc1.nextLine();
            int groupNumber =Integer.parseInt(hm.get(id));
            String exerciseName = exercise[groupNumber - 1];
            Pupil pupil = new Pupil(id,name,phoneNumber,groupNumber,exerciseName);
            arrP.add(pupil);
        }
        arrP.sort((o1,o2)->{
            String id1 = o1.getId();
            String id2 = o2.getId();
            return id1.compareTo(id2);
        });
        for(Pupil pupil : arrP){
            System.out.println(pupil);
        }
        sc1.close();
    }
}
