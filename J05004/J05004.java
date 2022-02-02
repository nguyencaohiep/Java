package J05004;
import java.util.*;
import java.text.ParseException;
public class J05004 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Pupil arr[] = new Pupil[n];
        for (int i = 0; i < n; i++) {
            int  id = i + 1;
            String fullName = sc.nextLine();
            String grade = sc.nextLine();
            String dateOfBirth = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            arr[i] = new Pupil(id, fullName, grade, dateOfBirth, gpa);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].toString());
        }
        sc.close();
    }
}


