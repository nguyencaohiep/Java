import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        HashMap<String,Subject> arrSub = new HashMap<String,Subject>();
        int n = Integer.parseInt(sc1.nextLine());
        for(int i = 0; i < n; i++){
            String id = sc1.nextLine();
            String name = sc1.nextLine();
            Subject sub = new Subject(id,name);
            arrSub.put(id,sub);
        }
        sc1.close();
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        ArrayList<Teacher> result = new ArrayList<>();
        HashMap<String,Teacher> arrTea = new HashMap<String,Teacher>();
        int m = Integer.parseInt(sc2.nextLine());
        for(int i = 0; i < m; i++){
            String id = sc1.nextLine();
            String name = sc1.nextLine();
            Teacher teacher = new Teacher(id,name);
            result.add(teacher);
            arrTea.put(id,teacher);
        }
        sc2.close();
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        int z = Integer.parseInt(sc3.nextLine());
        for(int i = 0; i < z; i++){
            String[]  line = sc3.nextLine().split("\\s+");
            Teacher teacher = arrTea.get(line[0]);
            Subject sub = arrSub.get(line[1]);
            float time = Float.parseFloat(line[2]);
            RealTime realTime = new RealTime(teacher,sub,time);
        }
        sc3.close();
        for(Teacher teacher : result){
            System.out.println(teacher);
        }
    }
}
