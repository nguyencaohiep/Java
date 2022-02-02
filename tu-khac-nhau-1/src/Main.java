import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("VANBAN.in"));
        int n = Integer.parseInt(scanner.nextLine());
        String input = "";
        while(scanner.hasNextLine()){
            input += scanner.nextLine() + " ";
        }
        String[] tmp = input.split("\\W");
        String in2 = "";
        for (String string:tmp){
            in2 += string+" ";
        }
        String[] in = in2.split(("\\s+"));
        HashMap<String,Integer> hs = new HashMap<String,Integer>();
        for(String str : in){
            if (hs.get(str) == null) {
                hs.put(str, 1);
            } else {
                hs.replace(str, hs.get(str) + 1);
            }
        }
        List<Word> arr = new ArrayList<>();
        ArrayList<String> keyArray = new ArrayList<>(hs.keySet());
        for (String i : keyArray) {
            Word word = new Word(i,hs.get(i));
            arr.add(word);
        }
        arr.sort(((o1, o2) -> {
            int c1 = o1.getCnt();
            int c2 = o2.getCnt();
            if(c1==c2)
                return o1.getContent().compareTo(o2.getContent());
            else{
                if(c1 < c2)
                    return 1;
                else
                    return -1;
            }
        }));

        for (Word word:arr){
            System.out.println(word);
        }
        scanner.close();
    }
}
/*
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ThongKeTuVB {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("VANBAN.in"));

        int n = Integer.parseInt(input.nextLine());
        String line = "";

        for (int i = 0; i < n; i++) {
            line += input.nextLine().trim() + " ";
        }

        line = line.toLowerCase().trim();
        line = line.replaceAll("\\!|\\?|\\.|\\:|\\,|\\-|\\/|\\;|\\(|\\)", " ");

        HashMap<String, Word> hm = new HashMap<>();
        String[] words = line.split("\\s+");

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
 */