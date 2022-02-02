import java.util.*;
import java.io.*;
public class WordSet {
    private ArrayList<String> arr = new ArrayList<>();

    public WordSet(String fileName) throws FileNotFoundException{
        HashSet<String> hs = new HashSet<String>();
        Scanner sc = new Scanner(new File(fileName));
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().trim().split("\\s+");
            for(String t : line) {
                String word = t.toLowerCase();
                if (!hs.contains(word)) {
                    hs.add(word);
                    arr.add(word);
                }
            }
        }
        Collections.sort(this.arr);
    }

    public String toString(){
        String res = "";
        for(String t : this.arr){
            res += t + "\n";
        }

        return res;
    }
}
