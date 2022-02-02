import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        Scanner scanner = new Scanner(new File("DATA.in"));

        while(scanner.hasNextInt()){
            int tmp = scanner.nextInt();
            if (hs.get(tmp) == null) {
                hs.put(tmp, 1);
            } else {
                hs.replace(tmp, hs.get(tmp) + 1);
            }
        }

        ArrayList<Integer> keyArray = new ArrayList<>(hs.keySet());
        Collections.sort(keyArray);

        for (Integer i : keyArray) {
            System.out.println(i + " " + hs.get(i));
        }

        scanner.close();
    }
}