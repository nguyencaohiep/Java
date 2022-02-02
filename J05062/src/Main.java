import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        List<Pupil> arr = new ArrayList<>();
        List<Pupil> arr1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine().trim().replaceAll("\\s+", " ");
            String[] tmp = sc.nextLine().trim().split("\\s+");
            double mediumScore = Double.parseDouble(tmp[0]);
            int trainingScore = Integer.parseInt(tmp[1]);
            Pupil pupil = new Pupil(name, mediumScore, trainingScore);
            arr.add(pupil);
            arr1.add(pupil);
        }
        arr1.sort((a, b) -> {
            double s1 = a.getMediumScore();
            double s2 = b.getMediumScore();
            return Double.compare(s1, s2) * -1;
        });
        double score = arr1.get(m - 1).getMediumScore();
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + arr.get(i).getType(score));
        }
        sc.close();
    }
}
/*
3 2
Nguyen Van Nam
3.59 75
Tran Hong Ngoc
3.61 90
Do Van An
3.22 90
 */
