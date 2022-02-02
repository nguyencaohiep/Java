import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class SortByValue implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
        return -i1.compareTo(i2);
    }
}

public class SoNguyenToLonNhatTrongFile {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> array = (ArrayList<Integer>) ob.readObject();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer i : array) {
            if (map.containsKey(i) || snt(i)) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        ArrayList<Integer> res = new ArrayList<>(map.keySet());
        Collections.sort(res);

        for (int i = res.size() - 1; i >= res.size() - 10; i--) {
            System.out.println(res.get(i) + " " + map.get(res.get(i)));
        }
        ob.close();
    }

    public static boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }
}