import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Product product = new Product(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine()));
            arr.add(product);
        }
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