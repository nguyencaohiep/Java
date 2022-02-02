import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        FileInputStream inputFile = new FileInputStream(new File("DATA.IN"));
        DataInputStream input = new DataInputStream(inputFile);

        for (int i = 0; i < 100000; i++) {
            int tmp = input.readInt();
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

        input.close();
    }
}
