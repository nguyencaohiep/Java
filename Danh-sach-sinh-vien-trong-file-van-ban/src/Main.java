import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("SV.in"));
        int n =Integer.parseInt(scanner.nextLine());
        List<Pupil> arr = new ArrayList();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String cl = scanner.nextLine();
            String date = scanner.nextLine();
            float gpa = Float.parseFloat(scanner.nextLine());
            Pupil pupil = new Pupil(i+1,name,cl,date,gpa);
            arr.add(pupil);
        }
        for(Pupil pupil : arr){
            System.out.println(pupil);
        }
        scanner.close();
    }
}