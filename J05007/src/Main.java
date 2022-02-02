import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Worker> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = i + 1;
            String fullName = sc.nextLine();
            String gender = sc.nextLine();
            String dateOfBirth = sc.nextLine();
            String address = sc.nextLine();
            String taxCode = sc.nextLine();
            String dateSign = sc.nextLine();
            Worker tmp = new Worker(id, fullName, gender, dateOfBirth, address, taxCode, dateSign);
            arr.add(tmp);
        }
        arr.sort((o1, o2) -> o1.convertDateOfBirth().compareTo(o2.convertDateOfBirth()));
        for (Worker worker : arr) {
            System.out.println(worker);
        }
        sc.close();
    }
}


