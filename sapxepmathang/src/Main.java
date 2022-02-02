import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> arrP = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Product p = new Product(i + 1, sc.nextLine(),sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            arrP.add(p);
        }
        Collections.sort(arrP);
        for(Product p : arrP){
            System.out.println(p);
        }
        sc.close();
    }
}
/*

 */