import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
class WordSet {
    private ArrayList<String> words = new ArrayList<>();

    public WordSet(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        String line = "";
        while (input.hasNextLine()) {
            line += input.nextLine() + " ";
        }

        line = line.toLowerCase().trim();
        HashSet<String> hm = new HashSet<>();
        String[] words = line.split("\\s+");

        for (String i : words) {
            if (hm.contains(i) == false) {
                hm.add(i);
                this.words.add(i);
            }
        }
        Collections.sort(this.words);
    }

    public String difference(WordSet s2){
        boolean same = false;
        String res ="";
        for(String i : this.words){
            same = false;
            for(String j : s2.words){
                if(i.equals(j)){
                    same= true;
                    break;
                }
            }
            if(!same){
                res += i + " ";
            }
        }
        return res.trim();
    }
}
