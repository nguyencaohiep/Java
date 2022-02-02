import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Pupil> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Pupil pupil = new Pupil(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(pupil);
        }
        arr.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
        int i = 1;
        for (Pupil pupil : arr) {
            System.out.println(i + " " + pupil);
            i++;
        }
        sc.close();
    }
}
/*
3
B20DCCN999
Nguyen Van Nam
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van An
D20CQAT02-B
6.0
6.0
4.0
B20DCCN111
Nguyen Van Binh
D20CQCN01-B
9.0
5.0
6.0
 */