import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Pupil> arr = new ArrayList<Pupil>();
        for (int i = 0; i < n; i++) {
            Pupil pupil = new Pupil();
            String id = Integer.toString(i + 1);
            if (id.length() == 1)
                id = "0" + id;
            String name = sc.nextLine();
            String[] tmp = sc.nextLine().split("\\s+");
            double score = 0;
            for (int j = 0; j < tmp.length; j++) {
                score += Double.parseDouble(tmp[j]);
            }
            score += Double.parseDouble(tmp[0]);
            score += Double.parseDouble(tmp[1]);
            pupil.setId(id);
            pupil.setScore(score/12);
            pupil.setName(name);
            arr.add(pupil);
        }
        arr.sort((o1, o2) -> {
            if (o1.getScore() == o2.getScore()) {
                return o1.getId().compareTo(o2.getId());
            }
            if (o1.getScore() > o2.getScore()) {
                return -1;
            } else
                return 1;
        });
        for (Pupil pupil : arr) {
            System.out.print(pupil);
            double t = pupil.getScore();
            if (t < 5)
                System.out.println("YEU");
            else if (t < 7)
                System.out.println("TB");
            else if (t < 8)
                System.out.println("KHA");
            else if (t < 9)
                System.out.println("GIOI");
            else
                System.out.println("XUAT SAC");
        }
        sc.close();
    }
}
/*
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
 */