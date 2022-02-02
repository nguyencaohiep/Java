import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Bill> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Bill bill = new Bill(i + 1, scanner.nextLine(), Integer.parseInt(scanner.nextLine()),
                    Integer.parseInt(scanner.nextLine()));
            arr.add(bill);
        }
        arr.sort((o1, o2) -> o1.getMoney().compareTo(o2.getMoney()) * -1);
        for (Bill bill : arr) {
            System.out.println(bill);
        }
        scanner.close();
    }
}
/*
3
Le Thi Thanh
468
500
Le Duc Cong
160
230
Ha Hue Anh
410
612
 */