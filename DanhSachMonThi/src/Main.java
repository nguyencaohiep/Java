import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Subject sub = new Subject(sc.nextLine(),sc.nextLine(),sc.nextLine());
            arr.add(sub);
        }
        Collections.sort(arr);
        for(Subject sub : arr){
            System.out.println(sub);
        }
        sc.close();

    }
}
