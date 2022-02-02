import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Subject> subHs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            Subject sub = new Subject(id,sc.nextLine(),sc.nextLine());
            subHs.put(id,sub);
        }
        sc = new Scanner (new File("CATHI.in"));
        int m = Integer.parseInt(sc.nextLine());
        HashMap<String, Test> testHs = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String id = String.format("C%03d", i + 1);
            Test test = new Test(id,sc.nextLine(),sc.nextLine(),sc.nextLine());
            testHs.put(id,test);
        }
        sc = new Scanner (new File("LICHTHI.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<TestSchedule> arr = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String[] line = sc.nextLine().split("\\s+");
            Test test = testHs.get(line[0]);
            Subject sub = subHs.get(line[1]);
            TestSchedule ts = new TestSchedule(test,sub,line[2],Integer.parseInt(line[3]));
            arr.add(ts);
        }
        Collections.sort(arr);
        for(TestSchedule ts : arr){
            System.out.println(ts);
        }
        sc.close();
    }
}
