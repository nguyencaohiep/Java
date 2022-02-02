import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Pattern p = Pattern.compile("\\w+");
        Matcher m;
        ArrayList<Pair<String, Integer>> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().toLowerCase();
            m = p.matcher(line);
            while (m.find()) {
                String word = m.group();
                if (!map.containsKey(word)) {
                    map.put(word, 1);
                } else {
                    map.put(word, map.get(word) + 1);
                }
            }
        }

        for (String key : map.keySet()) {
            list.add(new Pair<>(key, map.get(key)));
        }

        list.sort((a, b) -> {
            if (a.getValue() == b.getValue()) {
                return a.getKey().compareTo(b.getKey());
            }
            return b.getValue() - a.getValue();
        });

        for (Pair<String, Integer> pair : list) {
            System.out.println(pair);
        }
        sc.close();
    }

}