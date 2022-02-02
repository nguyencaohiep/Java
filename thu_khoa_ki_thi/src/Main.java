import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Pupil> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Pupil pupil = new Pupil(i + 1, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()),
                    Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            arr.add(pupil);
        }
        arr.sort(((o1, o2) -> {
            float s1 = o1.getSum();
            float s2 = o2.getSum();
            return Float.compare(s1, s2) * -1;
        }));
        float s = arr.get(0).getSum();
        for (Pupil pupil : arr) {
            if (pupil.getSum() == s)
                System.out.println(pupil);
            else
                break;
        }
        sc.close();
    }
}
/*
3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5
 */