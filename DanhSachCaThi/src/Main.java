import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Test> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Test test = new Test(i + 1,sc.nextLine(),sc.nextLine(),sc.nextLine());
            arr.add(test);
        }
        Collections.sort(arr);
        for(Test t : arr){
            System.out.println(t);
        }

        sc.close();

    }
}
