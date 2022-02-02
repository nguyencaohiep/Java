import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Department> arrD = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("\\s+");
            String name = "";
            for (int j = 1; j < line.length; j++) {
                name += line[j] + " ";
            }
            Department dep = new Department(line[0],name.trim());
            arrD.add(dep);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Ep> arrEp = new ArrayList();
        for (int i = 0; i < m; i++) {
            String id = sc.nextLine();
            Employee e = new Employee(id, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            Department dep = arrD.stream().filter(s -> s.getId().equals(id.substring(3,5))).findFirst().get();
            arrEp.add(new Ep(e, dep));
        }
        String dep = sc.nextLine().trim();
        String nameDep = arrD.stream().filter(d -> d.getId().equals(dep)).findFirst().get().getName();
        System.out.println("Bang luong phong " + nameDep + ":");
        arrEp.stream().filter(ep -> ep.getDep().getId().equals(dep)).forEach(System.out::println);
        sc.close();
    }
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
KH
 */
