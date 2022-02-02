import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Product product = new Product(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(product);
        }
        arr.sort(((o1, o2) -> {
            int m1 = o1.getMoneyTax();
            int m2 = o2.getMoneyTax();
            if (m1 < m2)
                return 1;
            else if (m1 > m2)
                return -1;
            else
                return 0;
        }));
        String code = sc.nextLine();
        for (Product product : arr) {
            if (product.getCode().equals(code))
                System.out.println(product);
        }
        sc.close();
    }
}
/*
3
A001Y
1000
B012N
2500
B003Y
4582
 */