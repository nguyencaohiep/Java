import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Athlete> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Athlete athlete = new Athlete(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(athlete);
        }
        arr.sort((a, b) -> {
            if (a.getV().equals(b.getV()))
                return a.getTime().compareTo(b.getTime());
            return a.getV().compareTo(b.getV()) * -1;
        });
        for (Athlete athlete : arr) {
            System.out.println(athlete);
        }
        sc.close();
    }
}
/*
3
Tran Vu Minh
Ha Noi
8:30
Vu Ngoc Hoang
Hoa Binh
8:20
Pham Dinh Tan
An Giang
8:45
 */
