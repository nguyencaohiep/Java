import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ThongKeTuVBFile {
    public static void main(String[] args) throws Exception {
        FileInputStream inp = new FileInputStream(new File("DATA.in"));
        ObjectInputStream input = new ObjectInputStream(inp);

        ArrayList<String> stringArray =  (ArrayList<String>) (input.readObject());

        String line = "";

        for (String i : stringArray) {
            line += i + " ";
        }

        line = line.toLowerCase().trim();

        HashMap<String, Word> hm = new HashMap<>();
        String[] words = line.split("\\W+");

        for (String i : words) {
            if (hm.get(i) == null) {
                hm.put(i, new Word(i));
            } else {
                Word tmp = hm.get(i);
                tmp.updateCnt();
                hm.replace(i, tmp);
            }
        }

        ArrayList<Word> wordByCnt = new ArrayList<>(hm.values());
        Collections.sort(wordByCnt);

        for (Word i : wordByCnt) {
            System.out.println(i.getValue() + " " + i.getCnt());
        }

        input.close();
    }
}
class Word implements Comparable<Word> {
    private Integer cnt;
    private String value;

    public Word(String value) {
        this.value = value;
        this.cnt = 1;
    }

    public void updateCnt() {
        cnt++;
    }

    public Integer getCnt() {
        return cnt;
    }

    public String getValue() {
        return value;
    }

    public int compareTo(Word n2) {
        if (this.cnt == n2.cnt)
            return this.value.compareTo(n2.value);
        return this.cnt.compareTo(n2.cnt) * -1;
    }
}
