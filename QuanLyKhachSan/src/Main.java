import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Room> arrR = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("\\s+");
            Room r = new Room(line[0], line[1], Integer.parseInt(line[2]), Double.parseDouble(line[3]));
            arrR.add(r);
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Bill> arrB = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = String.format("KH%02d", i + 1);
            Customer cus = new Customer(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            String c = cus.getMaPhong().charAt(2) + "";
            Room r = arrR.stream().filter(room -> room.getId().equals(c)).findFirst().get();
            arrB.add(new Bill(cus, r));
        }
        Collections.sort(arrB);
        for(Bill b : arrB){
            System.out.println(b);
        }
        sc.close();
    }
}
/*
2
C THUONG 150 0.03
B VIP 200 0.05
2
Nguyen Van Hoang
55B1
01/01/2021
05/01/2021
Nguyen Trung Dung
04C6
01/01/2021
10/01/2021
 */