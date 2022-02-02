import java.util.*;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Pupil> arr = new ArrayList<>();
        List<Double> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double score = Double.parseDouble(sc.nextLine());
            tmp.add(score);
            Pupil pupil = new Pupil(i + 1, name, score);
            arr.add(pupil);
        }
        Collections.sort(tmp);
        Collections.reverse(tmp);
        for (Pupil pupil : arr) {
            System.out.print(pupil);
            double score = pupil.getScore();
            int index = getFirstIndex(tmp, score);
            System.out.println(index);
        }
        sc.close();
    }

    public static int getFirstIndex(List<Double> arr, double a) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == a)
                return i + 1;
        }
        return 0;
    }
}