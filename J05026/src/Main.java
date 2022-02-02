import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Teacher> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Teacher teacher = new Teacher(i + 1, sc.nextLine(), sc.nextLine());
            arr.add(teacher);
        }
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String subject = sc.nextLine().trim();
            String tmp[] = subject.split("\\s+");
            String department = "";
            for (String t : tmp) {
                department += Character.toUpperCase(t.charAt(0));
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + department + ":");
            for (Teacher teacher : arr) {
                if (teacher.getEncode().equals(department))
                    System.out.println(teacher);
            }
        }
        sc.close();
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
Cong nghe phan mem
 */