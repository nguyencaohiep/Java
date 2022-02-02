import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.ArrayList;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Customer(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        arr.sort((o1, o2) -> Long.compare(o1.getDays(), o2.getDays()) * -1);
        for(Customer cs : arr){
            System.out.println(cs);
        }
        sc.close();
    }
}
