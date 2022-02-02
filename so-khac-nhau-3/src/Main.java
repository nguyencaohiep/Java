import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        FileInputStream inputFile = new FileInputStream(new File("DATA.in"));
        ObjectInputStream input = new ObjectInputStream(inputFile);
        ArrayList<Integer> arrayList = (ArrayList<Integer>) (input.readObject());

        for (int tmp : arrayList) {
            if (hs.get(tmp) == null) {
                hs.put(tmp, 1);
            } else {
                hs.replace(tmp, hs.get(tmp) + 1);
            }
        }
        ArrayList<Integer> res = new ArrayList<>(hs.keySet());
        Collections.sort(res);

        for (Integer tmp : res) {
            System.out.println(tmp + " " + hs.get(tmp));
        }
        input.close();
    }
}
