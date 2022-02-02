import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Product product = new Product(i + 1, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()),
                    Float.parseFloat(sc.nextLine()));
            arr.add(product);
        }
        arr.sort(((o1, o2) -> {
            float p1 = o1.getProfit();
            float p2 = o2.getProfit();
            return Float.compare(p1, p2) * -1;
        }
        ));
        for (Product product : arr) {
            System.out.println(product);
        }
        sc.close();
    }
}
/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
 */