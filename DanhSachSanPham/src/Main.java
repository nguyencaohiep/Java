import java.util.Scanner;
import java.util.ArrayList;
import java.text.ParseException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<Product> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            arr.add(new Product(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        for(Product p : arr) {
            System.out.println(p);
        }
        sc.close();
    }
}
