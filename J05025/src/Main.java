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
        arr.sort(((o1, o2) -> {
            if (o1.getName().equals(o2.getName()))
                return o1.getId().compareTo(o2.getId());
            else
                return o1.getName().compareTo(o2.getName());
        }));
        for (Teacher teacher : arr) {
            System.out.println(teacher);
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
 */