import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Employee> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine().trim().replaceAll("\\s+", " ");
            String name = input.substring(8);
            String role = input.substring(0, 2);
            String wage = input.substring(2, 4);
            String number = input.substring(4, 7);
            if (role.equals("GD")) {
                int num = Integer.parseInt(number);
                if (num > 1)
                    role = "NV";
            }
            else if (role.equals("TP") || role.equals("PP")) {
                int num = Integer.parseInt(number);
                if (num > 3)
                    role = "NV";
            }
            Employee employee = new Employee(name,role, number, wage);
            arr.add(employee);
        }
        arr.sort(((o1, o2) ->
        {
            String w1 = o1.getWage();
            String w2 = o2.getWage();
            if (w1.equals(w2)) {
                String n1 = o1.getNumber();
                String n2 = o2.getNumber();
                return n1.compareTo(n2);
            }
            return w1.compareTo(w2) * -1;
        }));
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String string = sc.nextLine();
            Employee.findByName(string, arr);
        }
        sc.close();
    }
}
/*
7
GD08001 Nguyen Kim Loan
GD08002 Nguyen Kim Doan
TP05002 Hoang Thanh Tuan
TP05001 Tran Binh Nguyen
PP06002 Phan Trung Tuan
PP06001 Tran Quoc Huy
NV04003 Vo Van Lan
2
OA
ng
 */
/*
6
GD08001 Nguyen Kim Loan
TP05002 Hoang Thanh Tuan
TP05001 Tran Binh Nguyen
PP06002 Phan Trung Tuan
PP06001 Tran Quoc Huy
NV04003 Vo Van Lan
2
OA
aN
 */