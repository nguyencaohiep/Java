import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Product product = new Product(sc.nextLine());
            arr.add(product);
        }
        Collections.sort(arr);
        for (Product product : arr) {
            System.out.println(product);
        }
        sc.close();
    }
}
/*
3
N89BP 4500
D00BP 3500
X92SH 2600
 */
