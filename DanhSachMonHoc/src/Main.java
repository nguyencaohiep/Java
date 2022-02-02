import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Subject sub = new Subject(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            arr.add(sub);
        }
        arr.sort((o1,o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        for(Subject sub : arr){
            System.out.println(sub);
        }
        sc.close();

    }
}
