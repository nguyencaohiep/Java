import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
public class J05005 {
    public static void main(String[] args) throws ParseException{
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
       List<Pupil> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = i + 1;
            String name = scanner.nextLine();
            String grade = scanner.nextLine();
            String dateOfBirth = scanner.nextLine();
            float gpa = Float.parseFloat(scanner.nextLine());
            Pupil tmp = new Pupil(id, name, dateOfBirth, grade, gpa);
            list.add(tmp);
        }
        list.sort(null);
        for (Pupil item : list) {
            System.out.println(item);
        }
        scanner.close();

    }
}


