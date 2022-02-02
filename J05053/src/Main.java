import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Bill> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Bill bill = new Bill(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()),
                    Long.parseLong(sc.nextLine()));
            arr.add(bill);
        }
        arr.sort(((o1, o2) -> o1.getStt().compareTo(o2.getStt())));
        for (Bill bill : arr) {
            System.out.println(bill);
        }
        sc.close();
    }
}
/*
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
     */


