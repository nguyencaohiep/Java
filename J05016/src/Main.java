import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Bill> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Bill bill = new Bill(1 + i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    Integer.parseInt(sc.nextLine()));
            arr.add(bill);
        }
        Collections.sort(arr);
        for (Bill bill : arr) {
            System.out.println(bill);
        }
        sc.close();
    }
}

/*
3
Huynh Van Thanh
103
05/06/2010
05/06/2010
15
Le Duc Cong
106
08/03/2010
01/05/2010
220
Tran Thi Bich Tuyen
207
10/04/2010
21/04/2010
96
 */