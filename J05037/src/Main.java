import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Product product = new Product(i + 1, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()),
                    Long.parseLong(sc.nextLine()));
            arr.add(product);
        }
        arr.sort((o1, o2) ->
                Long.compare(o1.getPrice(), o2.getPrice()) * -1);
        for (Product product : arr) {
            System.out.println(product);
        }
        sc.close();
    }
}

/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
 */