import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Test> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            Test test = new Test(i + 1, sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()));
            arr.add(test);
        }
        arr.sort((a, b) -> {
            double s1 = a.getMediumScore();
            double s2 = b.getMediumScore();
            if (s1 > s2)
                return -1;
            else if (s1 < s2)
                return +1;
            else return 0;
        });
        for (Test test : arr) {
            System.out.println(test);
        }
        sc.close();
    }
}
/*
3
Nguyen Thai Binh
45
75
Le Cong Hoa
4
4.5
Phan Van Duc
56
56
 */